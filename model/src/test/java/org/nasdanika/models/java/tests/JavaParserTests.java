package org.nasdanika.models.java.tests;

import static com.github.javaparser.ParseStart.COMPILATION_UNIT;
import static com.github.javaparser.Providers.provider;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.Test;
import org.nasdanika.models.java.util.JavaParserResourceFactory;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.Provider;
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
	
		
}
