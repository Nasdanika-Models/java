package org.nasdanika.models.java.cli;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.nasdanika.cli.CommandBase;
import org.nasdanika.cli.ProgressMonitorMixin;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.models.coverage.Counter;
import org.nasdanika.models.coverage.Coverage;
import org.nasdanika.models.coverage.ModuleCoverage;
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

import com.azure.ai.openai.OpenAIClient;
import com.azure.ai.openai.OpenAIClientBuilder;
import com.azure.ai.openai.models.ChatChoice;
import com.azure.ai.openai.models.ChatCompletions;
import com.azure.ai.openai.models.ChatCompletionsOptions;
import com.azure.ai.openai.models.ChatRequestMessage;
import com.azure.ai.openai.models.ChatRequestUserMessage;
import com.azure.ai.openai.models.ChatResponseMessage;
import com.azure.core.credential.KeyCredential;

import picocli.CommandLine.Command;
import picocli.CommandLine.Mixin;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(
		description = "Generates JUnit tests",
		versionProvider = VersionProvider.class,		
		mixinStandardHelpOptions = true,		
		name = "junit")
public class JUnitTestGeneratorCommand extends CommandBase {
		
	@Mixin
	private ProgressMonitorMixin progressMonitorMixin;	
		
	@Parameters(		
		index =  "0",	
		description = "Project directory")
	private File projectDir;
	
	@Parameters(
			index =  "1", 
			description = "Coverage threshold")
	private int threshold;
	
	@Parameters(
			index =  "2", 
			description = {
					"Output directory",
					"relative to the project directory"
			})
	private String output;
		
	@Option(
			names = {"-J", "--jacoco"}, 
			description = {
					"jacoco.exec file path relative",
					"to the project directory,",
					"defaults to ${DEFAULT-VALUE}"
				}, 
			defaultValue = "target/jacoco.exec")
	private String jacoco;		
	
	@Option(
			names = {"-c", "--classes"}, 
			description = {
					"Classes directory path relative",
					"to the project directory,",
					"defaults to ${DEFAULT-VALUE}"
				}, 
			defaultValue = "target/classes")
	private String classes;		
	
	@Option(
			names = {"-s", "--sources"}, 
			description = {
					"Sources directory path relative",
					"to the project directory,",
					"defaults to ${DEFAULT-VALUE}"
				}, 
			defaultValue = "src/main/java")
	private String sources;		
	
	@Option(
			names = {"-v", "--api-key-variable"}, 
			description = {
					"OpenAPI key environment variable",
					"defaults to ${DEFAULT-VALUE}"
				}, 
			defaultValue = "OPEN_API_KEY")
	private String apiKeyEnvironmentVariable;		
	
	@Option(
			names = {"-k", "--api-key"}, 
			description = "OpenAPI key")
	private String apiKey;		
	
	@Option(
			names = "--api-endpoint", 
			description = {
					"OpenAPI endpoint",
					"defaults to ${DEFAULT-VALUE}"
				}, 
			defaultValue = "https://api.openai.com/v1/chat/completions")
	private String apiEndpoint;
		
	@Option(
			names = { "-m", "--model" }, 
			description = {
					"OpenAPI deployment or model",
					"defaults to ${DEFAULT-VALUE}"
				}, 
			defaultValue = "gpt-4")
	private String deploymentOrModelName;
	
	@Option(
			names = { "-r", "--prompt" }, 
			description = {
					"Propmt",
					"defaults to ${DEFAULT-VALUE}"
				}, 
			defaultValue = "Generate a JUnit 5 test method leveraging Mockito for the following Java method")
	private String prompt;	
		
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
			defaultValue = "Rests")
	private String classSuffix;	
	
	@Option(
			names = "--disables", 
			description = "Generate disabled tests")
	private boolean disabled;	
	
	
	// TODO 
	// sorting
	// coverage type - lines, instructions, branches
	// generate explanation and recommendations 
	
	@Override
	public Integer call() throws Exception {
		try (ProgressMonitor progressMonitor = progressMonitorMixin.createProgressMonitor(1)) {	
			ResourceSet resourceSet = new ResourceSetImpl();
			
			// Loading coverage data
			ModuleCoverage moduleCoverage = ModuleCoverage.loadJacoco(
					projectDir.getName(), 
					new File(projectDir, jacoco),
					new File(projectDir, classes));
			
			Map<String, Object> extensionFactoryMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
	
			// Registering Java factory for loading java sources
			extensionFactoryMap.put(CompilationUnit.JAVA_EXTENSION, new JavaParserResourceFactory(new ModuleCoverageProvider(moduleCoverage)));
			
			// Registering XMI factory & URI handler for loading directory contents
			extensionFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
			resourceSet.getURIConverter().getURIHandlers().add(0, new DirectoryContentFileURIHandler());
			
			File outputDir = new File(projectDir, output); 
			
			if (apiKey == null) {
				apiKey = System.getenv(apiKeyEnvironmentVariable);
			}
			
	    	// Loading API key from an environment variable 
	    	OpenAIClient openAIClient = Util.isBlank(apiKey) ? null : new OpenAIClientBuilder()
	    		    .credential(new KeyCredential(apiKey))
	    		    .endpoint("https://api.openai.com/v1/chat/completions")
	    		    .buildClient();
	    	
	    	URI sourceDirURI = URI.createFileURI(new File(projectDir, sources).getCanonicalPath());
	    	Resource sourceDirResource = resourceSet.getResource(sourceDirURI, true);
	    	for (EObject root: sourceDirResource.getContents()) {
	    		 visit(root, outputDir, openAIClient, progressMonitor);
	    	}
			
			return 0;
		}
	}		
	
	/**
	 * @param eObj
	 * @param outputDir
	 * @param openAIClient
	 * @throws IOException 
	 */
	private void visit(
			EObject eObj, 
			File outputDir, 
			OpenAIClient openAIClient,
			ProgressMonitor progressMonitor) throws IOException {
		
		if (eObj instanceof Tree) {
			for (TreeItem treeItem: ((Tree) eObj).getTreeItems()) {
				URI itemURI = URI.createURI(treeItem.getName()).resolve(eObj.eResource().getURI().appendSegment(""));
				Resource itemResource = eObj.eResource().getResourceSet().getResource(itemURI, true);
		    	for (EObject root: itemResource.getContents()) {
		    		 visit(root, outputDir, openAIClient, progressMonitor);
		    	}
			}
		} else if (eObj instanceof CompilationUnit) {
			CompilationUnit compilationUnit = (CompilationUnit) eObj;
			// TODO - includes/excludes
			
			System.out.println(compilationUnit.getName()); // TODO - progress monitor, split
			String sourcePackageName = compilationUnit.getPackageName();
			for (Type type: compilationUnit.getTypes()) {
				if ((type instanceof org.nasdanika.models.java.Class || type instanceof Interface)) {					
					System.out.println("\t" + type.getName()); // TODO - progress monitor
					
					org.nasdanika.models.java.Class testClass = JavaFactory.eINSTANCE.createClass();
					testClass.setName(type.getName() + classSuffix); // Variation point
					
					CompilationUnit testCompilationUnit = JavaFactory.eINSTANCE.createCompilationUnit();
					testCompilationUnit.setPackageName(sourcePackageName + packageSuffix); // Variation point
					testCompilationUnit.setName(testClass.getName() + "." + CompilationUnit.JAVA_EXTENSION);
					testCompilationUnit.getTypes().add(testClass);
					
					for (Member member: type.getMembers()) {
						// Just methods here, add constructors, static/instance/field initializers as needed  
						if (member instanceof Method && member.getModifiers().contains(type instanceof Interface ? "default" : "public")) {
							Method method = (Method) member;
							int covered = 0;
							int missed = 0;							
							for (Coverage coverage: method.getCoverage()) {
								// Using line coverage as more human-intuitive, change to other counter type as needed
								Counter lineCounter = coverage.getLineCounter();
								covered += lineCounter.getCovered();
								missed += lineCounter.getMissed();
							}
							
							System.out.printf("\t\t%s - %d / %d%n", method.getName(), covered, missed); // TODO - progress monitor
							int total = missed + covered;
							// Variation points: Minimum method length and minimum coverage.
							// For this demo - methods longer than 5  lines with less than 50% coverage
							if (total > 5 && covered * 2 < total) {  
								testClass.getMembers().add(generateTestMethod(method, openAIClient, progressMonitor));
							}
						}
					}
					
					// Saving non-empty compilation units to file resources.
					if (!testClass.getMembers().isEmpty()) {
						File testCompilationUnitFile = new File(outputDir, testCompilationUnit.getPackageName().replace('.', '/') + "/" + testCompilationUnit.getName());
						testCompilationUnitFile.getParentFile().mkdirs();
						Resource testCompilationUnitResource = eObj.eResource().getResourceSet().createResource(URI.createFileURI(testCompilationUnitFile.getAbsolutePath()));
						testCompilationUnitResource.getContents().add(testCompilationUnit);
						testCompilationUnitResource.save(null);
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
	private Member generateTestMethod(
			Method method, 
			OpenAIClient openAIClient,
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
		if (openAIClient != null) {
			bodyBuilder
				.append(indent)
				.append(indent)
				.append("// *** Start generated test ***")
				.append(System.lineSeparator());
			
			// Calling OpenAI to generate test code
	        List<ChatRequestMessage> chatMessages = new ArrayList<>();
	        chatMessages.add(new ChatRequestUserMessage(prompt + ": ")); 
	        chatMessages.add(new ChatRequestUserMessage(method.getSource()));
	        
	        ChatCompletions chatCompletions = openAIClient.getChatCompletions(deploymentOrModelName, new ChatCompletionsOptions(chatMessages));
	        for (ChatChoice choice : chatCompletions.getChoices()) {
	            ChatResponseMessage message = choice.getMessage();
	            String generatedTestCase = message.getContent();
	            if (!Util.isBlank(generatedTestCase)) {
	            	// The output might be "massaged" - stripped of backticks, parsed, imports added to the compilation unit
	            	
	            	String[] lines = generatedTestCase.split("\\R");					            	
	            	for (String line: lines) {
			            bodyBuilder
			            	.append(indent)
			            	.append(indent)
			            	.append("// ") // Commenting generated code - it might not compile
			            	.append(line)
			            	.append(System.lineSeparator());
	            	}
	            }
	        }
	
			bodyBuilder
				.append(indent)
				.append(indent)
				.append("// *** End generated test ***")
				.append(System.lineSeparator());
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

}
