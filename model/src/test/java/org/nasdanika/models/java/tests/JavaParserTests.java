package org.nasdanika.models.java.tests;

import static com.github.javaparser.ParseStart.COMPILATION_UNIT;
import static com.github.javaparser.Providers.provider;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.Test;
import org.nasdanika.models.coverage.Counter;
import org.nasdanika.models.coverage.Coverage;
import org.nasdanika.models.coverage.ModuleCoverage;
import org.nasdanika.models.java.Code;
import org.nasdanika.models.java.Type;
import org.nasdanika.models.java.util.JavaParserResourceFactory;
import org.nasdanika.models.java.util.ModuleCoverageProvider;
import org.nasdanika.ncore.Tree;
import org.nasdanika.ncore.TreeItem;
import org.nasdanika.ncore.util.DirectoryContentFileURIHandler;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ParserConfiguration.LanguageLevel;
import com.github.javaparser.Provider;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.printer.lexicalpreservation.LexicalPreservingPrinter;
import com.github.javaparser.resolution.SymbolResolver;
import com.github.javaparser.resolution.TypeSolver;
import com.github.javaparser.resolution.types.ResolvedType;
import com.github.javaparser.symbolsolver.JavaSymbolSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.CombinedTypeSolver;
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
	public void testLoadSourceDirectory() throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("java", new JavaParserResourceFactory());		

		// For loading directory contents
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());		
		URIHandler fileDirectoryURIHandler = new DirectoryContentFileURIHandler();
		resourceSet.getURIConverter().getURIHandlers().add(0, fileDirectoryURIHandler);
		
		
		String javaSourcesPath = new File("src/main/java").getCanonicalPath();
		Resource javaSourcesResource = resourceSet.getResource(URI.createFileURI(javaSourcesPath), true);
		for (EObject root: javaSourcesResource.getContents()) {
			visit(root);
		}		
	}
	
	private void visit(EObject eObject) {
		System.out.println(eObject);
		if (eObject instanceof TreeItem) {
			System.out.println(((TreeItem) eObject).getName());
		}
		if (eObject instanceof Tree) {
			for (TreeItem treeItem: ((Tree) eObject).getTreeItems()) {
				URI itemURI = URI.createURI(treeItem.getName()).resolve(eObject.eResource().getURI().appendSegment(""));
				Resource itemResource = eObject.eResource().getResourceSet().getResource(itemURI, true);
				for (EObject root: itemResource.getContents()) {
					visit(root);
				}		
			}
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
		File projectDir = new File("../../coverage/model/testData").getCanonicalFile();
		File jacocoExec = new File(projectDir, "target/jacoco.exec");
		ResourceSet resourceSet = new ResourceSetImpl();		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		ModuleCoverage moduleCoverage = ModuleCoverage.loadJacoco("org.nasdanika.graph", jacocoExec, new File(projectDir, "target/classes"));
		
		// Don't really need to save coverage
		Resource coverageResource = resourceSet.createResource(URI.createURI("target/coverage.xmi")); 
		coverageResource.getContents().add(moduleCoverage);
		coverageResource.save(null); // For manual inspection
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("java", new JavaParserResourceFactory(new ModuleCoverageProvider(moduleCoverage)));		
		
		String javaSourcePath = new File(projectDir, "src/main/java/org/nasdanika/graph/processor/ProcessorConfigFactory.java").getCanonicalPath();
		Resource javaResource = resourceSet.getResource(URI.createFileURI(javaSourcePath), true);		
		for (EObject root: javaResource.getContents()) {
			System.out.println(root);
			org.nasdanika.models.java.CompilationUnit cu = (org.nasdanika.models.java.CompilationUnit) root;
			EList<Coverage> coverage = cu.getCoverage();
			System.out.println(coverage.size());
			
			for (Type type: cu.getTypes()) {
				System.out.println("\t" + type.getFullyQualifiedName());
				EList<Coverage> typeCoverage = type.getCoverage();
				System.out.println("\t" + typeCoverage.size());
			}
		}		
		
		TreeIterator<EObject> tit = javaResource.getAllContents();
		while (tit.hasNext()) {
			EObject next = tit.next();
			if (next instanceof Code) {
				Code code = (Code) next;
				EList<Coverage> coverage = code.getCoverage();
				if (coverage == null) {
					System.out.println(code.getName());
				} else {
					int covered = 0;
					int missed = 0;
					for (Coverage c: coverage) {
						Counter lc = c.getLineCounter();
						covered += lc.getCovered();
						missed += lc.getMissed();
					}
					System.out.println(code.getName() + " -> " + covered + " / " + missed);
				}
			}
		}		
	}
	
	@Test	
	public void testPlayground() {
		ParserConfiguration parserConfiguration = new ParserConfiguration();
		parserConfiguration.setLexicalPreservationEnabled(true);
		parserConfiguration.setLanguageLevel(LanguageLevel.JAVA_17);
		TypeSolver typeSolver = new CombinedTypeSolver(); // Just the source in context
		SymbolResolver symbolSolver = new JavaSymbolSolver(typeSolver);
		parserConfiguration.setSymbolResolver(symbolSolver);
		JavaParser parser = new JavaParser(parserConfiguration);
		ParseResult<CompilationUnit> parseResult = parser.parse(
			"""
			package org.nasdanika.test;	
				
			public class Element<T extends Map> {
					
				private void matchPredicate(T map, Object<? extends String> obj, String expr) {
					
				}
						
			}
			""");
		System.out.println(parseResult.getProblems());
		System.out.println(parseResult.isSuccessful());
		CompilationUnit cu = parseResult.getResult().get();
		System.out.println(cu);
		System.out.println("----");
		System.out.println(LexicalPreservingPrinter.print(cu));
		TypeDeclaration<?> type = cu.getType(0);
		MethodDeclaration method = (MethodDeclaration) type.getMember(0);
		Parameter parameter = method.getParameter(0);
		com.github.javaparser.ast.type.Type pType = parameter.getType();
		System.out.println(pType);
		ResolvedType resolvedType = pType.resolve();
		System.out.println(resolvedType);		
		
		
	}	
		
}
