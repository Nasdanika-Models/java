package org.nasdanika.models.java.tests;

import static com.github.javaparser.ParseStart.COMPILATION_UNIT;
import static com.github.javaparser.Providers.provider;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.ModuleDeclaration;
import org.junit.jupiter.api.Test;
import org.nasdanika.models.java.util.JavaParserResourceFactory;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.Provider;
import com.github.javaparser.utils.SourceRoot;

public class JavaTests {
	
	@Test
	public void testJDTASTParser() throws Exception {
		ASTParser parser = ASTParser.newParser(AST.getJLSLatest());
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		String source = Files.readString(new File("src/main/java/org/nasdanika/models/java/JavaPackage.java").toPath());
		parser.setSource(source.toCharArray());
		parser.setResolveBindings(true);
		CompilationUnit cu = (CompilationUnit) parser.createAST(null);
		cu.accept(new ASTVisitor() {

			@Override
			public void preVisit(ASTNode node) {
				System.out.println(node);
				super.preVisit(node);
			}
			
			@Override
			public boolean visit(MethodDeclaration node) {
				System.out.println("Method " + node.getName().getFullyQualifiedName());
				return super.visit(node);
			}
		});		
	}
	
	/**
	 * Does not really parse module declaration
	 * @throws Exception
	 */
	@Test
	public void testParsingModuleInfo() throws Exception {
		ASTParser parser = ASTParser.newParser(AST.getJLSLatest());
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		String source = Files.readString(new File("src/main/java/module-info.java").toPath());
		parser.setSource(source.toCharArray());
		parser.setResolveBindings(true);
		CompilationUnit cu = (CompilationUnit) parser.createAST(null);
		cu.accept(new ASTVisitor() {
			
			@Override
			public void preVisit(ASTNode node) {
				System.out.println(node);
				super.preVisit(node);
			}
			
			@Override
			public boolean visit(ModuleDeclaration node) {
				System.out.println("Module " + node.getName().getFullyQualifiedName());
				return super.visit(node);
			}
		});		
	}	
	
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
	
//	/**
//	 * A working parsing code using Java parser.
//	 * @throws Exception
//	 */
//	@Test
//	public void testSymbolSolver() throws Exception {
//		TypeSolver typeSolver = new MemoryTypeSolver();		
//		JavaSymbolSolver symbolSolver = new JavaSymbolSolver(typeSolver);
//		com.github.javaparser.StaticJavaParser.getParserConfiguration().setSymbolResolver(symbolSolver);;		
//		
//		String source = Files.readString(new File("src/main/java/org/nasdanika/models/java/JavaPackage.java").toPath());
//		com.github.javaparser.ast.CompilationUnit cu = com.github.javaparser.StaticJavaParser.parse(source);
//		
//		cu.accept(new com.github.javaparser.ast.visitor.ModifierVisitor<Void>() {
//            /**
//             * For every if-statement, see if it has a comparison using "!=".
//             * Change it to "==" and switch the "then" and "else" statements around.
//             */
//            @Override
//            public com.github.javaparser.ast.visitor.Visitable visit(com.github.javaparser.ast.expr.MethodCallExpr n, Void arg) {
//            	ResolvedType rType = n.calculateResolvedType();
//            	System.out.println(n.toString() + " is a: " + rType);
//                return super.visit(n, arg);
//            }
//        }, null);		
//	}	
		
}
