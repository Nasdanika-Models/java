package org.nasdanika.models.java.util;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.Util;
import org.nasdanika.models.coverage.ClassCoverage;
import org.nasdanika.models.coverage.Coverage;
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
import org.nasdanika.models.java.Source;
import org.nasdanika.models.java.Type;
import org.nasdanika.models.java.TypeParameter;

public class ModuleCoverageProvider implements Function<Source<?>, Coverage> {
	
	private static final String CONSTRUCTOR_NAME = "<init>";
	private static final String CLASS_INITIALIZER_NAME = "<clinit>";
	
	private ModuleCoverage coverage;

	public ModuleCoverageProvider(ModuleCoverage coverage) {
		this.coverage = coverage;
	}

	@Override
	public Coverage apply(Source<?> source) {
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
								return sf;
							}
						}
					}
				}
				return null;
			}
			throw new UnsupportedOperationException();
		}
		
		if (source instanceof Type) {
			for (PackageCoverage pkg: coverage.getPackages()) {
				for (ClassCoverage cc: pkg.getClasses()) {
					if (Objects.equals(cc.getName().replace('/', '.').replace('$', '.'), ((Type) source).getFullyQualifiedName())) {
						return cc;
					}
				}
			}			
		}
		
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
				List<TypeParameter> enclosingTypeTypeParameters = type.getTypeParameters();
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
									return mc;
								}
							}
						}
					}
				}
			} else if (codeContainer instanceof Field) {
				// TODO - field initializer
			}
		}
		
		return null;
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
