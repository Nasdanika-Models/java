package org.nasdanika.models.java.tests;

import static com.github.javaparser.ParseStart.COMPILATION_UNIT;
import static com.github.javaparser.Providers.provider;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.merge.java.facade.FacadeHelper;
import org.eclipse.emf.codegen.merge.java.facade.JCompilationUnit;
import org.eclipse.emf.codegen.merge.java.facade.ast.ASTFacadeHelper;
import org.eclipse.emf.codegen.util.CodeGenUtil;
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
import org.nasdanika.models.java.JavaFactory;
import org.nasdanika.models.java.util.JavaParserResourceFactory;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.Provider;
import com.github.javaparser.utils.SourceRoot;

public class MergeTests {
	
	private static final String NEW_COMPILATION_UNIT = """
			package org.nasdanika.common;
			
			/**
			 * @generated
			 */
			public interface FunctionFactory<T,R> extends ExecutionParticipantFactory<Function<T,R>> {
				
				/**
				 * @generated
				 */
				interface Provider {
					<T,R> FunctionFactory<T,R> getFactory(Class<T> parameterType, Class<R> resultType);
				}	
				
				/**
				 * @generated
				 */
				default <V> FunctionFactory<T,V> then(FunctionFactory<? super R, V> then) {
					// New comment
					return new FunctionFactory<T, V>() {
						
						@Override
						public Function<T, V> create(Context ctx) {
							return FunctionFactory.this.create(ctx).then(then.create(ctx));
						}
						
					};
				}
					
				/**
				 * @generated
				 */
				default ConsumerFactory<T> then(ConsumerFactory<? super R> then) {
					return new ConsumerFactory<T>() {
						
						@Override
						public Consumer<T> create(Context context) {
							return FunctionFactory.this.create(context).then(then.create(context));
						}
						
					};
				}	
			}			
			""";
	
	private static final String OLD_COMPILATION_UNIT = """
			package org.nasdanika.common;
			
			/**
			 * @generated
			 */
			public interface FunctionFactory<T,R> extends ExecutionParticipantFactory<Function<T,R>> {
				
				/**
				 * @generated
				 */
				interface Provider {
					<T,R> FunctionFactory<T,R> getFactory(Class<T> parameterType, Class<R> resultType);
				}	
				
				/**
				 * @generated
				 */
				default <V> FunctionFactory<T,V> then(FunctionFactory<? super R, V> then) {
					// Old comment
					return new FunctionFactory<T, V>() {
						
						@Override
						public Function<T, V> create(Context context) {
							return FunctionFactory.this.create(context).then(then.create(context));
						}
						
					};
				}
					
				/**
				 * @generated NOT
				 */
				default ConsumerFactory<T> then(ConsumerFactory<? super R> then) {
					// Old comment
					return new ConsumerFactory<T>() {
						
						@Override
						public Consumer<T> create(Context context) {
							return FunctionFactory.this.create(context).then(then.create(context));
						}
						
					};
				}	
			}			
			""";
	
	@Test
	public void testJMerger() {
	    JControlModel controlModel = new JControlModel();
		
		// Create model
		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();

		// create adapter factory
		GeneratorAdapterFactory adapterFactory = GenModelGeneratorAdapterFactory.DESCRIPTOR.createAdapterFactory();
		adapterFactory.setGenerator(new org.eclipse.emf.codegen.ecore.generator.Generator());
		adapterFactory.initialize(genModel);

		// get merge rules URI
		String mergeRulesURI = adapterFactory.getGenerator().getOptions().mergeRulesURI;
	    
	    FacadeHelper facadeHelper = CodeGenUtil.instantiateFacadeHelper(ASTFacadeHelper.class.getCanonicalName());
	    facadeHelper.setCompilerCompliance("17");
		controlModel.initialize(facadeHelper, mergeRulesURI);
	    
		JMerger jMerger = new JMerger(controlModel);												
		
		JCompilationUnit newCompilationUnit = jMerger.createCompilationUnitForContents(NEW_COMPILATION_UNIT);
		jMerger.setSourceCompilationUnit(newCompilationUnit);
		
		JCompilationUnit oldCompilationUnit = jMerger.createCompilationUnitForContents(OLD_COMPILATION_UNIT);
		jMerger.setTargetCompilationUnit(oldCompilationUnit);
		
		jMerger.merge();
		
		String mergedCompilationUnitContents = jMerger.getTargetCompilationUnitContents();
		System.out.println(mergedCompilationUnitContents);		
	}
	
	@Test
	public void testCompilationUnitMerge() {
		org.nasdanika.models.java.CompilationUnit cu = JavaFactory.eINSTANCE.createCompilationUnit();
		cu.setSource(OLD_COMPILATION_UNIT);
		cu.merge(NEW_COMPILATION_UNIT, "17");
		System.out.println(cu.getSource());		
	}
	
		
}
