package org.nasdanika.models.java.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.Util;
import org.nasdanika.models.coverage.ClassCoverage;
import org.nasdanika.models.coverage.Coverage;
import org.nasdanika.models.coverage.Line;
import org.nasdanika.models.coverage.MethodCoverage;
import org.nasdanika.models.coverage.ModuleCoverage;
import org.nasdanika.models.coverage.PackageCoverage;
import org.nasdanika.models.coverage.SourceFileCoverage;
import org.nasdanika.models.java.ClassInitializer;
import org.nasdanika.models.java.Code;
import org.nasdanika.models.java.CompilationUnit;
import org.nasdanika.models.java.Constructor;
import org.nasdanika.models.java.Field;
import org.nasdanika.models.java.GenericType;
import org.nasdanika.models.java.JavaFactory;
import org.nasdanika.models.java.Operation;
import org.nasdanika.models.java.Parameter;
import org.nasdanika.models.source.Position;
import org.nasdanika.models.java.Source;
import org.nasdanika.models.java.Type;
import org.nasdanika.models.java.TypeParameter;

public class ModuleCoverageProvider implements Function<Source,Collection<Coverage>> {
	
	private static final String CONSTRUCTOR_NAME = "<init>";
	private static final String CLASS_INITIALIZER_NAME = "<clinit>";
	
	private ModuleCoverage coverage;

	// Lines grouped by package and then by source file ordered by line with most specific retained.
	private Map<String, Map<String, List<LineRecord>>> lines = new HashMap<>();

	public ModuleCoverageProvider(ModuleCoverage coverage) {
		this.coverage = coverage;
		for (PackageCoverage pc: coverage.getPackages()) {
			Map<String, List<LineRecord>> packageLines = Util.groupBy(getPackageLines(pc), LineRecord::sourceFileName);
			packageLines.entrySet().forEach(entry -> {
				List<LineRecord> sourceFileLines = entry.getValue();				
				Collections.sort(sourceFileLines, (a,b) -> a.line().getNumber() - b.line().getNumber());
				LineRecord[] sfla = sourceFileLines.toArray(new LineRecord[sourceFileLines.size()]);
				sourceFileLines.clear();
				Z: for (int i = 0; i < sfla.length; ++i) {
					LineRecord first = sfla[i];
					if (first != null) {
						for (int j = i + 1; j < sfla.length; ++j) {
							LineRecord second = sfla[j];
							if (second != null) {
								if (first.equals(second) || first.isMoreSpecific(second)) {
									sfla[j] = null;
								} else if (second.isMoreSpecific(first)) {
									sfla[i] = null;
									continue Z;
								}								
							}							
						}
						sourceFileLines.add(first);
					}					
				}
			});
			lines.put(pc.getName(), packageLines);
		}				
	}

	@Override
	public Collection<Coverage> apply(Source source) {		
		if (source instanceof CompilationUnit) {
			CompilationUnit cu = (CompilationUnit) source;
			if (cu.eContainer() == null) {
				Resource cuResource = cu.eResource();
				if (cuResource == null) {
					throw new UnsupportedOperationException();					
				}
				String cuName = cuResource.getURI().lastSegment();
				String packageName = cu.getPackageName();
				if (!Util.isBlank(packageName)) {
					packageName = packageName.replace(".", "/");
				}
				for (PackageCoverage pkg: coverage.getPackages()) {
					if (Objects.equals(pkg.getName(), packageName)) {
						for (SourceFileCoverage sf: pkg.getSourceFiles()) {
							if (Objects.equals(cuName, sf.getName())) {
								return Collections.singleton(sf);
							}
						}
					}
				}
				return Collections.emptyList();
			}
			throw new UnsupportedOperationException();
		}
		
		if (source instanceof Type) {
			for (PackageCoverage pkg: coverage.getPackages()) {
				for (ClassCoverage cc: pkg.getClasses()) {
					if (Objects.equals(cc.getName().replace('/', '.').replace('$', '.'), ((Type) source).getFullyQualifiedName())) {
						return Collections.singleton(cc); 
					}
				}
			}			
		}
		
		Collection<Coverage> ret = new ArrayList<>();
		if (source instanceof Code) {			
			Code code = (Code) source;
			String codeName = code.getName();
			if (code instanceof Constructor) {
				codeName = CONSTRUCTOR_NAME;
			} else if (code instanceof ClassInitializer) {
				codeName = CLASS_INITIALIZER_NAME;
			}
			EObject codeContainer = code.eContainer();
			if (codeContainer instanceof Type) {				
				Type type = (Type) codeContainer;
				String typeFQN = type.getFullyQualifiedName();
				List<TypeParameter> enclosingTypeTypeParameters = type.getTypeParameters(); // TODO - refactor to symbol solver
				for (PackageCoverage pkg: coverage.getPackages()) {
					for (ClassCoverage cc: pkg.getClasses()) {
						if (Objects.equals(cc.getName().replace('/', '.').replace('$', '.'), typeFQN)) {
							for (MethodCoverage mc: cc.getMethods()) {
								String name = mc.getName();								
								List<Parameter> parameters = code instanceof Operation ? ((Operation) code).getParameters() : Collections.emptyList();
								List<TypeParameter> typeParameters = code instanceof Operation ? ((Operation) code).getTypeParameters() : Collections.emptyList();								
								if (name.equals(codeName) && matchParameters(
										typeParameters, 
										code.getModifiers().contains("static") ? Collections.emptyList() : enclosingTypeTypeParameters,
										parameters, 
										mc.getParameterTypes())) {
									ret.add(mc);
								}
							}
						}
					}
				}
			} else if (codeContainer instanceof Field) {
				// TODO - field initializer
			}
		}
		
		// Matching by lines - looking through all lines in the containing package
		EObject container = source.eContainer();
		while (container != null && !(container instanceof CompilationUnit)) {
			container = container.eContainer();
		}
				
		if (container instanceof CompilationUnit) {
			CompilationUnit cu = (CompilationUnit) container;
			if (cu.eContainer() == null) {
				Resource cuResource = cu.eResource();
				if (cuResource == null) {
					throw new UnsupportedOperationException();					
				}
				String cuName = cuResource.getURI().lastSegment();
				String packageName = cu.getPackageName();
				Map<String, List<LineRecord>> pLines = lines.get(packageName.replace('.', '/'));
				if (pLines != null) {
					List<LineRecord> sLines = pLines.get(cuName);
					if (sLines != null) {
						Position begin = source.getBegin();
						Position end = source.getEnd();
						if (begin != null && begin.getLine() != -1 && end != null && end.getLine() != -1) {						
							for (LineRecord line: sLines) {
								int lineNumber = line.line().getNumber();
								if (lineNumber >= begin.getLine() && lineNumber <= end.getLine() && !ret.contains(line.containingCoverage())) {
									ret.add(line.containingCoverage());
								}
							}
						}
					}
				}
			}
		}
		
		return ret;
	}
	
	private static record LineRecord(
			Coverage containingCoverage,
			String packageName, 
			String sourceFileName, 
			String className,
			String methodName,
			List<String> parameterTypes,
			Line line) {
		
		boolean isSameLine(LineRecord lineRecord) {
			if (lineRecord == null) {
				return false;
			}
			
			if (equals(lineRecord)) {
				return true;
			}
			
			if (!Objects.equals(packageName(), lineRecord.packageName())) {
				return false;
			}
			
			if (!Objects.equals(sourceFileName(), lineRecord.sourceFileName())) {
				return false;
			}
			
			return line().getNumber() == lineRecord.line().getNumber();
		}
		
		/**
		 * Returns true if this record is more specific that the other.
		 * It means it is for the same package, for the same source file, for the same line
		 * and either the class name is longer or coverage is more specific - for a method, for example.
		 * This method is used for deduplication 
		 * @param lineRecord 
		 * @return
		 */
		boolean isMoreSpecific(LineRecord lineRecord) {
			if (equals(lineRecord)) {
				return false;
			}
			
			if (!isSameLine(lineRecord)) {
				return false;
			}
			
			if (containingCoverage() instanceof MethodCoverage) {				
				if (lineRecord.containingCoverage() instanceof ClassCoverage) {				
					// If this one is a method coverage and the other one is class coverage then either this one
					// is more specific if the other contains this one or the container of this one is more specific - a method in an anonymous class.
					EObject container = containingCoverage().eContainer();
					if (container == lineRecord.containingCoverage()) {
						return true;
					}
					
					if (container instanceof ClassCoverage) {
						ClassCoverage containerCoverage = (ClassCoverage) container;
						LineRecord containerLineRecord = new LineRecord(
								containerCoverage,
								containerCoverage.getPackageName(), 
								containerCoverage.getSourceFile(), 
								containerCoverage.getName(), 
								null, 
								null, 
								line());
						
						return containerLineRecord.isMoreSpecific(lineRecord);
					}
					
					return false;
				}
				
				// Method coverage - lambdas
				return containingCoverage().eContainer() == lineRecord.containingCoverage().eContainer() && methodName().startsWith("lambda$" + lineRecord.methodName() + "$");
			}
			
			// Class coverage
			if (lineRecord.containingCoverage() instanceof ClassCoverage) {
				return lineRecord.className() != null && className() != null && className().startsWith(lineRecord.className() + "$"); // Nested or anonymous class
			}
			
			// Class coverage in a method coverage - anonymous classes.			
			EObject lrContainer = lineRecord.containingCoverage().eContainer();
			if (lrContainer instanceof ClassCoverage) {
				ClassCoverage containerCoverage = (ClassCoverage) lrContainer;
				LineRecord containerLineRecord = new LineRecord(
						containerCoverage,
						containerCoverage.getPackageName(), 
						containerCoverage.getSourceFile(), 
						containerCoverage.getName(), 
						null, 
						null, 
						line());
				
				return isMoreSpecific(containerLineRecord);
			}
			
			return false;
		}
		
	}
	
	private static Collection<LineRecord> getPackageLines(PackageCoverage packageCoverage) {
		List<LineRecord> ret = new ArrayList<>();
		for (ClassCoverage classCoverage: packageCoverage.getClasses()) {
			for (Line classLine: classCoverage.getLines()) {
				ret.add(new LineRecord(
						classCoverage,
						classCoverage.getPackageName(), 
						classCoverage.getSourceFile(), 
						classCoverage.getName(), 
						null, 
						null, 
						classLine));
			}
			for (MethodCoverage methodCoverage: classCoverage.getMethods()) {
				for (Line methodLine: methodCoverage.getLines()) {
					ret.add(new LineRecord(
							methodCoverage,
							classCoverage.getPackageName(), 
							classCoverage.getSourceFile(), 
							classCoverage.getName(), 
							methodCoverage.getName(), 
							methodCoverage.getParameterTypes(), 
							methodLine));
				}
			}
		}				
		return ret;
	}
	
	protected boolean matchParameters(
			List<TypeParameter> typeParameters, 
			List<TypeParameter> enclosingTypeTypeParameters, 
			List<Parameter> parameters, 
			List<String> parameterTypes) {
		if (parameters.size() != parameterTypes.size()) {
			return false;
		}
		for (int i = 0; i < parameters.size(); ++i) {
			Parameter parameter = parameters.get(i);
			GenericType genericType = parameter.getType();
			// Method and enclosing type type parameters
			for (TypeParameter tp: typeParameters) {
				if (tp.getName().equals(genericType.getName())) {
					EList<GenericType> bounds = tp.getBounds();
					if (bounds.size() == 1) {
						// Using the first bound. 
						genericType = bounds.get(0);
					} else {
						// Object. TODO - how to handle multiple bundles?
						genericType = JavaFactory.eINSTANCE.createGenericType();
						genericType.setName("java.lang.Object");
					}
				}
			}
			
			
			for (TypeParameter tp: typeParameters) {
				if (tp.getName().equals(genericType.getName())) {
					EList<GenericType> bounds = tp.getBounds();
					if (bounds.size() == 1) {
						// Using the first bound. 
						genericType = bounds.get(0);
					} else {
						// Object. TODO - how to handle multiple bundles?
						genericType = JavaFactory.eINSTANCE.createGenericType();
						genericType.setName("java.lang.Object");
					}
				}
			}
			
			String parameterType = parameterTypes.get(i);
			if (genericType.isPrimitive()) {
				if (!genericType.getName().equals(parameterType)) {
					return false;
				}
			} else {
				String gtFQN = genericType.getFullyQualifiedName();
				if (Util.isBlank(gtFQN)) {
					// Using simple name and making assumptions
					String gtName = genericType.getName();
					if (gtName.contains(".")) {
						// Assuming fully qualified simple name, may be wrong
						if (!gtName.equals(parameterType)) {
							return false;
						}						
					} else {
						int lastDot = parameterType.lastIndexOf('.');
						if (lastDot == -1) {
							if (!gtName.equals(parameterType)) {
								return false;
							}							
						} else {
							if (!gtName.equals(parameterType.substring(lastDot + 1))) {
								return false;
							}
						}
					}
				} else {
					if (!gtFQN.equals(parameterType)) {
						return false;
					}
				}
				
			}
		}
		
		return true;
	}

}
