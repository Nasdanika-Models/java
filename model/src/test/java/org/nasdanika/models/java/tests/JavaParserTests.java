package org.nasdanika.models.java.tests;

import static com.github.javaparser.ParseStart.COMPILATION_UNIT;
import static com.github.javaparser.Providers.provider;

import java.io.File;
import java.io.IOException;
import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.Test;
import org.nasdanika.models.coverage.Coverage;
import org.nasdanika.models.coverage.ModuleCoverage;
import org.nasdanika.models.java.Source;
import org.nasdanika.models.java.util.JavaParserResourceFactory;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.signature.SignatureReader;
import org.objectweb.asm.signature.SignatureVisitor;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ParserConfiguration.LanguageLevel;
import com.github.javaparser.Provider;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.utils.SourceRoot;

public class JavaParserTests {
	
	/**
	 * A working parsing code using Java parser's SourceRoot.
	 * @throws Exception
	 */
	@Test
	public void testParsingModuleInfoWithSourceRoot() throws Exception {
		SourceRoot sourceRoot = new SourceRoot(new File("src/main/java").toPath());
		com.github.javaparser.ast.CompilationUnit moduleInfo = sourceRoot.parse("", "module-info.java");
		System.out.println(moduleInfo.getModule());
	}
		
	/**
	 * A working parsing code using Java parser.
	 * @throws Exception
	 */
	@Test
	public void testParsingModuleInfoWithJavaParser() throws Exception {
		ParserConfiguration configuration = new ParserConfiguration();
        Provider provider = provider(new File("src/main/java/module-info.java").toPath(), configuration.getCharacterEncoding());
		final ParseResult<com.github.javaparser.ast.CompilationUnit> result = new JavaParser(configuration).parse(COMPILATION_UNIT, provider);
		
		com.github.javaparser.ast.CompilationUnit compilationUnit = result.getResult().get();
		System.out.println(compilationUnit.getClass());
	}	
	
	@Test
	public void testJavaResourceFactory() throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("java", new JavaParserResourceFactory());		
		
		String javaPackagePath = new File("src/main/java/org/nasdanika/models/java/JavaPackage.java").getCanonicalPath();
		Resource javaPackageResource = resourceSet.getResource(URI.createFileURI(javaPackagePath), true);
		for (EObject root: javaPackageResource.getContents()) {
			System.out.println(root);
		}		
	}
	
	@Test
	public void testPrivateInterfaceMethod() {
		ParserConfiguration parserConfiguration = new ParserConfiguration();
		parserConfiguration.setLanguageLevel(LanguageLevel.JAVA_17);
		JavaParser parser = new JavaParser(parserConfiguration);
		ParseResult<CompilationUnit> parseResult = parser.parse(
			"""
					package org.nasdanika.graph;
					
					public interface Element {
					
						private void matchPredicate(Object obj, String expr) {
						
						}
						
					}
			""");
		System.out.println(parseResult.getProblems());
		System.out.println(parseResult.isSuccessful());
		System.out.println(parseResult.getResult());
	}
	
	@Test
	public void testLoadingCoverage() throws Exception {
		File projectDir = new File("../../../git/core/graph");
		File jacocoExec = new File(projectDir, "target/jacoco.exec");
		ResourceSet resourceSet = new ResourceSetImpl();		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		ModuleCoverage moduleCoverage = ModuleCoverage.loadJacoco("org.nasdanika.graph", jacocoExec, new File(projectDir, "target/classes"));
		
		// Don't really need it
		Resource coverageResource = resourceSet.createResource(URI.createURI("target/coverage.xmi")); 
		coverageResource.getContents().add(moduleCoverage);
		coverageResource.save(null); // For manual inspection
		
		Function<Source, Coverage> coverageProvider = source -> {
			System.out.println(source);
			return null;
		};
		
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("java", new JavaParserResourceFactory(coverageProvider));		
		
		String javaPackagePath = new File("src/main/java/org/nasdanika/models/java/JavaPackage.java").getCanonicalPath();
		Resource javaPackageResource = resourceSet.getResource(URI.createFileURI(javaPackagePath), true);
		for (EObject root: javaPackageResource.getContents()) {
			System.out.println(root);
		}		
	}	
		
}
