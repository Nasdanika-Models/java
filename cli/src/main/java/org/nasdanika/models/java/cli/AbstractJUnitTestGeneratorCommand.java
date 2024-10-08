package org.nasdanika.models.java.cli;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.function.BiFunction;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.nasdanika.cli.CommandBase;
import org.nasdanika.cli.ParentCommands;
import org.nasdanika.cli.ProgressMonitorMixIn;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.models.coverage.Counter;
import org.nasdanika.models.coverage.Coverage;
import org.nasdanika.models.coverage.ModuleCoverage;
import org.nasdanika.models.gitlab.cli.GitLabContributorCommand;
import org.nasdanika.models.gitlab.util.GitLabURIHandler;
import org.nasdanika.models.java.Annotation;
import org.nasdanika.models.java.CompilationUnit;
import org.nasdanika.models.java.Interface;
import org.nasdanika.models.java.JavaFactory;
import org.nasdanika.models.java.Member;
import org.nasdanika.models.java.Method;
import org.nasdanika.models.java.Source;
import org.nasdanika.models.java.Type;
import org.nasdanika.models.java.util.JavaParserResourceFactory;
import org.nasdanika.models.java.util.ModuleCoverageProvider;
import org.nasdanika.ncore.Tree;
import org.nasdanika.ncore.TreeItem;
import org.nasdanika.ncore.util.DirectoryContentFileURIHandler;
import org.springframework.util.AntPathMatcher;

import picocli.CommandLine.Mixin;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.ParentCommand;

/**
 * Base class for command generating JUnit tests based on coverage results
 */
@ParentCommands( GitLabContributorCommand.class)
public abstract class AbstractJUnitTestGeneratorCommand extends CommandBase {
	
	@ParentCommand
	private GitLabContributorCommand parent;
		
	@Mixin
	private ProgressMonitorMixIn progressMonitorMixin;	
		
	@Parameters(		
		index =  "0",	
		description = "Project URI")
	private String projectURI;
	
	@Option(
			names = "-f", 
			description = "Project URI is a file path")
	private boolean isFileURI;				
	
	@Parameters(
			index =  "1", 
			description = "Coverage threshold")
	private int coverageThreshold;
	
	public enum CoverageType {
		complexity, instruction, branch, line
	}
		
	@Option(
			names = {"-t", "--coverage-type"}, 
			description = {
					"Coverage type",
					"Valid values: ${COMPLETION-CANDIDATES}",
					"defaults to ${DEFAULT-VALUE}"
				}, 
			defaultValue = "line")
	private CoverageType coverageType;			
	
	@Parameters(
			index =  "2", 
			description = {
					"Output URI",
					"relative to the project URI"
			})
	private String output;
	
	@Option(
			names = {"-s", "--sources"}, 
			description = {
					"Sources URI path relative",
					"to the project URIy,",
					"defaults to ${DEFAULT-VALUE}"
				}, 
			defaultValue = "src/main/java")
	private String sources;		
		
	@Option(
			names = {"-e", "--exclude"},
			arity = "*",
			description = {
					"Source excludes",
					"Ant pattern"
				})
	private String[] excludes;
	
	@Option(
			names = {"-i", "--include"},
			arity = "*",
			description = {
					"Source includes",
					"Ant pattern"
				})
	private String[] includes;	
	
	@Option(
			names = { "-l", "--limit" }, 
			description = {
					"Maximum number of test classes",
					"to generate"
				})
	private int limit;
		
	@Option(
			names = "--package-suffix", 
			description = {
					"Test package suffix",
					"defaults to ${DEFAULT-VALUE}"
				}, 
			defaultValue = ".tests")
	private String packageSuffix;	
		
	@Option(
			names = "--class-suffix", 
			description = {
					"Test class suffix",
					"defaults to ${DEFAULT-VALUE}"
				}, 
			defaultValue = "Tests")
	private String classSuffix;	
	
	@Option(
			names = "--disabled", 
			description = "Generate disabled tests")
	private boolean disabled;	
		
	@Option(
			names = { "-w", "--overwrite" }, 
			description = "Overwrite existing tests")
	private boolean overwrite;	

	@Override
	public Integer call() throws Exception {
		return call(null);
	}
	
	public Integer call(BiFunction<URI, ProgressMonitor, ModuleCoverage> coverageProvider) {		
		return call(coverageProvider, null);
	}	
	
	public Integer call(BiFunction<URI, ProgressMonitor, ModuleCoverage> coverageProvider, GitLabURIHandler gitLabURIHandler) {		
		try (ProgressMonitor progressMonitor = progressMonitorMixin.createProgressMonitor(1)) {
			URI theProjectURI;			
			if (isFileURI) {
				theProjectURI = URI.createFileURI(new File(projectURI).getCanonicalPath()).appendSegment("");
			} else {
				URI base = URI.createFileURI(new File(".").getCanonicalPath());
				theProjectURI = URI.createURI(projectURI).resolve(base);
			}
			
			// Loading coverage data
			ModuleCoverage moduleCoverage = coverageProvider == null ? null : coverageProvider.apply(theProjectURI, progressMonitor);
			
			ResourceSet resourceSet = new ResourceSetImpl(); // TODO - from capability
			Map<String, Object> extensionFactoryMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
	
			// Registering Java factory for loading java sources
			extensionFactoryMap.put(CompilationUnit.JAVA_EXTENSION, new JavaParserResourceFactory(coverageProvider == null ? null : new ModuleCoverageProvider(moduleCoverage)));
			
			// Registering XMI factory & URI handler for loading directory contents
			extensionFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
			EList<URIHandler> uriHandlers = resourceSet.getURIConverter().getURIHandlers();
			uriHandlers.add(0, new DirectoryContentFileURIHandler());
			if (gitLabURIHandler != null) {
				uriHandlers.add(0, gitLabURIHandler);				
			}
			
			
			URI outputURI = URI.createURI(output).resolve(theProjectURI).appendSegment(""); 
	    	URI sourcesURI = URI.createURI(sources).resolve(theProjectURI).appendSegment("");
	    	Resource sourceDirResource = resourceSet.getResource(sourcesURI, true);
	    	int[] remaining = { limit };
	    	for (EObject root: sourceDirResource.getContents()) {
	    		 visit(root, sourcesURI, outputURI, remaining, progressMonitor);
	    	}

	    	stats(progressMonitor);
	    	
			return 0;
		}
	}	
	
	// TODO 
	// sorting
	// coverage type - lines, instructions, branches
	// generate explanation and recommendations 
	// limit
	// overwrite - policy?		
	
	/**
	 * Override to outputstats such as token usage to progress monitor. 
	 * @param progressMonitor
	 */
	protected void stats(ProgressMonitor progressMonitor) {
		
	}	
	
	/**
	 * @param eObj
	 * @param baseURI Used to deresolve compilation unit URI's to includes/excludes
	 * @param outputDir
	 * @param openAIClient
	 * @throws IOException 
	 */
	protected void visit(
			EObject eObj, 
			URI baseURI,
			URI outputDir,
			int[] remaining,
			ProgressMonitor progressMonitor) throws IOException {
		
		if (limit > 0 && remaining[0] <= 0) {
			return;
		}
		
		if (eObj instanceof Tree) {
			for (TreeItem treeItem: ((Tree) eObj).getTreeItems()) {
				URI itemURI = URI.createURI(treeItem.getName()).resolve(eObj.eResource().getURI().appendSegment(""));				
				Resource itemResource = eObj.eResource().getResourceSet().getResource(itemURI, true);
		    	for (EObject root: itemResource.getContents()) {
		    		 visit(root, baseURI, outputDir, remaining, progressMonitor);
		    	}
			}
		} else if (eObj instanceof CompilationUnit) {			
			String path = eObj.eResource().getURI().deresolve(baseURI, true, true, true).toString();
			
			if (includes != null) {
				boolean matched = false;
				for (String include: includes) {
					AntPathMatcher matcher = new AntPathMatcher();
					if (matcher.match(include, path)) {
						matched = true;
						break;
					}
				}
				if (!matched) {
					return;
				}
			}
			
			if (excludes != null) {
				for (String exclude: excludes) {
					AntPathMatcher matcher = new AntPathMatcher();
					if (matcher.match(exclude, path)) {
						return;
					}
				}					
			}			
			
			CompilationUnit compilationUnit = (CompilationUnit) eObj;
			// TODO - includes/excludes
			try (ProgressMonitor compilationUnitProgressMonitor = progressMonitor.split(compilationUnit.getName(), 1.0, compilationUnit)) {
				String sourcePackageName = compilationUnit.getPackageName();
				for (Type type: compilationUnit.getTypes()) {					
					if ((type instanceof org.nasdanika.models.java.Class || type instanceof Interface)) {
						try (ProgressMonitor typeProgressMonitor = compilationUnitProgressMonitor.split(type.getName(), 1.0, type)) {						
							org.nasdanika.models.java.Class testClass = JavaFactory.eINSTANCE.createClass();
							testClass.setName(type.getName() + classSuffix); // Variation point
							
							CompilationUnit testCompilationUnit = JavaFactory.eINSTANCE.createCompilationUnit();
							testCompilationUnit.setPackageName(sourcePackageName + packageSuffix); // Variation point
							testCompilationUnit.setName(testClass.getName() + "." + CompilationUnit.JAVA_EXTENSION);
							testCompilationUnit.getTypes().add(testClass);
							File testCompilationUnitFile = new File(outputDir, testCompilationUnit.getPackageName().replace('.', '/') + "/" + testCompilationUnit.getName());
							
							if (overwrite || !testCompilationUnitFile.exists()) {
								for (Member member: type.getMembers()) {
									// Just methods here, add constructors, static/instance/field initializers as needed  
									if (member instanceof Method && member.getModifiers().contains(type instanceof Interface ? "default" : "public")) {
										Method method = (Method) member;
										int covered = 0;
										int missed = 0;							
										for (Coverage coverage: method.getCoverage()) {
											Counter counter =
												switch (coverageType) {
												case branch -> coverage.getBranchCounter();
												case complexity -> coverage.getComplexityCounter();
												case instruction -> coverage.getInstructionCounter();
												case line -> coverage.getLineCounter();
											};
													
											covered += counter.getCovered();
											missed += counter.getMissed();
										}
										
										int total = missed + covered;
										if (total > 0 && covered * 100 / total < coverageThreshold) {
											try (ProgressMonitor methodProgressMonitor = typeProgressMonitor.split(method.getName(), 1, method)) {
												Member testMethod = generateTestMethod(method, testClass, methodProgressMonitor);
												if (testMethod != null) {
													testClass.getMembers().add(testMethod);
												}
											}
										}
									}
								}
								
								// Saving non-empty compilation units to file resources.
								if (!testClass.getMembers().isEmpty()) {
									testCompilationUnitFile.getParentFile().mkdirs();
									Resource testCompilationUnitResource = eObj.eResource().getResourceSet().createResource(URI.createFileURI(testCompilationUnitFile.getAbsolutePath()));
									testCompilationUnitResource.getContents().add(testCompilationUnit);
									testCompilationUnitResource.save(null);
									--remaining[0];
								}
							}
						}
					}
				}
			}
		}
		
	}

	/**
	 * Generates a test method for a given method
	 * @param method
	 * @param openAIClient
	 * @return
	 */
	protected Member generateTestMethod(
			Method method, 
			org.nasdanika.models.java.Class testClass,
			ProgressMonitor progressMonitor) {
		Method testMethod = JavaFactory.eINSTANCE.createMethod();
		testMethod.setName("test" + StringUtils.capitalize(method.getName())); // Variation point
		testMethod.getModifiers().add("public");
		
		Annotation testAnnotation = Annotation.create("${import/org.junit.jupiter.api.Test}");
		testMethod.getAnnotations().add(testAnnotation);
		
		// May generate methods as disabled
		if (disabled) {
			Annotation disabledAnnotation = Annotation.create("${import/org.junit.jupiter.api.Disabled}", "TODO: Review/adjust generated code");
			testMethod.getAnnotations().add(disabledAnnotation);
		}
				
		StringBuilder bodyBuilder = new StringBuilder("{").append(System.lineSeparator());
		String indent = testMethod.getIndent();
		String body = generateTestMethodBody(method, indent, testClass, progressMonitor);
		if (!Util.isBlank(body)) {
			bodyBuilder.append(body);
		}
		
		bodyBuilder
			.append(indent)
			.append("}")
			.append(System.lineSeparator());

		Source methodBody = JavaFactory.eINSTANCE.createSource();
		methodBody.setSource(bodyBuilder.toString());
		testMethod.setBody(methodBody);
		
		return testMethod;
	}

	/**
	 * 
	 * @param method
	 * @param indent
	 * @param testClass Receiving test class, can be used to add helper members.
	 * @param progressMonitor
	 * @return
	 */
	protected abstract String generateTestMethodBody(
			Method method, 
			String indent,
			org.nasdanika.models.java.Class testClass,
			ProgressMonitor progressMonitor);

}
