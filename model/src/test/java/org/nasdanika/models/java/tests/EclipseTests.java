package org.nasdanika.models.java.tests;

import java.io.File;
import java.nio.file.Files;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.ModuleDeclaration;
import org.junit.jupiter.api.Test;

public class EclipseTests {
	
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
	
}
