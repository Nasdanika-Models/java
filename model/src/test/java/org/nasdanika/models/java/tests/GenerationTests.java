package org.nasdanika.models.java.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.nio.file.Files;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.Test;
import org.nasdanika.common.Context;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.PropertyComputer;
import org.nasdanika.common.SimpleMutableContext;
import org.nasdanika.models.java.Annotation;
import org.nasdanika.models.java.CompilationUnit;
import org.nasdanika.models.java.GenericType;
import org.nasdanika.models.java.JavaPackage;
import org.nasdanika.models.java.NamedElement;
import org.nasdanika.models.java.Source;
import org.nasdanika.models.java.TypeParameter;
import org.nasdanika.models.java.util.JavaParserResourceFactory;
import org.nasdanika.models.java.util.SimpleImportManager;
import org.nasdanika.models.source.GenerationMode;

public class GenerationTests {
	
	@Test
	public void testSourceGeneration() {
		
	}
		
	@Test
	public void testMerge() throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("java", new JavaParserResourceFactory());		
		File javaSource = new File("target/MergeTest.java");
		Files.writeString(
				javaSource.toPath(),
				"""
				package org.nasdanika.test;	
					
				/**
				 * Type comment
				 * @generated
				 */	
				@Generated
				public class Element<T extends Map> {
					
					/* Method comment */
					@Test		
					private void matchPredicate(T map, Object<? extends String> obj, String expr) {
						
					}
							
				}
				""");		
		
		Resource javaResource = resourceSet.getResource(URI.createFileURI(javaSource.getCanonicalPath()), true);		
		for (EObject root: javaResource.getContents()) {
			System.out.println(root);
			org.nasdanika.models.java.CompilationUnit cu = (org.nasdanika.models.java.CompilationUnit) root;
		}		
		javaResource.save(null);
	}		
	
	@Test
	public void testRewrite() throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("java", new JavaParserResourceFactory());		
		File javaSource = new File("target/RewriteTest.java");
		Files.writeString(
				javaSource.toPath(),
				"""
				package org.nasdanika.test;	
					
				/**
				 * Type comment
				 * @generated
				 */	
				@Generated(generator = "Nasdanika")
				@MarkerAnnotationTest
				@SingleMemberAnnotationTest(33)
				public class Element<T extends Map> {
					
					/* Method comment */
					@Test		
					private void matchPredicate(T map, Object<? extends String> obj, String expr) {
						System.out.println("Hello");
					}
					
					// Field comment
					private int z = 77;
					
					/**
					 * Nested class comment
					 */
					public static class Nested {
					
					}  
							
				}
				""");		
		
		Resource javaResource = resourceSet.getResource(URI.createFileURI(javaSource.getCanonicalPath()), true);
		javaResource.getAllContents().forEachRemaining(c -> {
			if (c instanceof Source && c.eContainingFeature() != JavaPackage.Literals.CODE__BODY) {
				((Source) c).setGenerationMode(GenerationMode.CONTENTS);
			}
		});
	
		javaResource.save(null);
	}		

	@Test 
	public void testGenericType() {
		GenericType gt = GenericType.create("T");
		String src = gt.generate(null, 0);
		assertEquals("T", src);
	}

	@Test 
	public void testGenericTypeWithTypeArguments() {
		GenericType gt = GenericType.create("Map", GenericType.create("String"), GenericType.create("Integer"));
		String src = gt.generate(null, 0);
		assertEquals("Map<String,Integer>", src);		
	}

	@Test 
	public void testGenericTypeWithUpperBound() {
		GenericType gt = GenericType.createUpperBound(GenericType.create("Map"));
		String src = gt.generate(null, 0);
		assertEquals("? extends Map", src);				
	}

	@Test 
	public void testGenericTypeWithLowerBound() {
		GenericType gt = GenericType.createLowerBound(GenericType.create("Map"));
		String src = gt.generate(null, 0);
		assertEquals("? super Map", src);						
	}

	@Test 
	public void testTypeParameter() {
		TypeParameter tp = TypeParameter.create("T");
		String src = tp.generate(null, 0);
		assertEquals("T", src);		
	}
	
	@Test 
	public void testTypeParameterWithBounds() {
		TypeParameter tp = TypeParameter.create("T", GenericType.create("String"), GenericType.create("Integer"));
		String src = tp.generate(null, 0);
		assertEquals("T extends String & Integer", src);		
	}
	
	@Test
	public void testSimpleClass() {
		org.nasdanika.models.java.Class cls = org.nasdanika.models.java.Class.create("MyClass", "public"); 
		String src = cls.generate(null, 0);
		assertTrue(src.startsWith("public class MyClass {"), src);				
	}
	
	@Test
	public void testClassExtendsNull() {
		org.nasdanika.models.java.Class cls = org.nasdanika.models.java.Class.create("MyClass", "public");
		cls.getSuperTypes().add(GenericType.create(null));
		String src = cls.generate(null, 0);
		assertTrue(src.startsWith("public class MyClass {"), src);				
	}
	
	@Test
	public void testClassExtendsObject() {
		org.nasdanika.models.java.Class cls = org.nasdanika.models.java.Class.create("MyClass", "public");
		cls.getSuperTypes().add(GenericType.createObjectType());
		String src = cls.generate(null, 0);
		assertTrue(src.startsWith("public class MyClass {"), src);				
	}
	
	@Test
	public void testClassExtendsNullImplementsList() {
		org.nasdanika.models.java.Class cls = org.nasdanika.models.java.Class.create("MyClass", "public");
		cls.getSuperTypes().add(GenericType.create(null));
		cls.getSuperTypes().add(GenericType.create("List"));
		String src = cls.generate(null, 0);
		assertTrue(src.startsWith("public class MyClass implements List {"), src);				
	}
	
	@Test
	public void testClassExtendsObjectImplementsListAndMap() {
		org.nasdanika.models.java.Class cls = org.nasdanika.models.java.Class.create("MyClass", "public");
		cls.getSuperTypes().add(GenericType.createObjectType());
		cls.getSuperTypes().add(GenericType.create("List"));
		cls.getSuperTypes().add(GenericType.create("Map"));
		String src = cls.generate(null, 0);
		assertTrue(src.startsWith("public class MyClass implements List, Map {"), src);				
	}
	
	@Test
	public void testClassExtendsRunnableImplementsListAndMap() {
		org.nasdanika.models.java.Class cls = org.nasdanika.models.java.Class.create("MyClass", "public");
		cls.getSuperTypes().add(GenericType.create("Runnable"));
		cls.getSuperTypes().add(GenericType.create("List"));
		cls.getSuperTypes().add(GenericType.create("Map"));
		String src = cls.generate(null, 0);
		assertTrue(src.startsWith("public class MyClass extends Runnable implements List, Map {"), src);				
	}
	
	@Test
	public void testPermits() {
		org.nasdanika.models.java.Class cls = org.nasdanika.models.java.Class.create("MyClass", "public");
		cls.getPermits().add(GenericType.create("Runnable"));
		cls.getPermits().add(GenericType.create("List"));
		cls.getPermits().add(GenericType.create("Map"));
		String src = cls.generate(null, 0);
		assertTrue(src.startsWith("public class MyClass permits Runnable, List, Map {"), src);				
	}
	
	@Test
	public void testNested() {
		org.nasdanika.models.java.Class cls = org.nasdanika.models.java.Class.create("MyClass", "public");		
		org.nasdanika.models.java.Class nested = org.nasdanika.models.java.Class.create("Nested", "public", "static");
		cls.getMembers().add(nested);
		String src = cls.generate(null, 0);
		System.out.println(src);
	}
	
	@Test
	public void testMarkerAnnotation() {
		Annotation ma = Annotation.create("Generated");
		String src = ma.generate(null, 0);
		assertEquals("@Generated", src);
	}
	
	@Test
	public void testSingleMemberAnnotation() {
		Annotation ma = Annotation.create("Generated", NamedElement.create(null, "33"));
		String src = ma.generate(null, 0);
		assertEquals("@Generated(33)", src);
	}
	
	@Test
	public void testNormalAnnotation() {
		Annotation ma = Annotation.create("Generated", NamedElement.create("age", "33"), NamedElement.create("gender", "\"male\""));
		String src = ma.generate(null, 0);
		assertEquals("@Generated(age = 33, gender = \"male\")", src);
	}
		
	@Test
	public void testCreate() throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("java", new JavaParserResourceFactory());		
		File javaSource = new File("target/CreateTest.java");		
		Resource javaResource = resourceSet.createResource(URI.createFileURI(javaSource.getCanonicalPath()));
		CompilationUnit cu = CompilationUnit.create("MyClass.java", "org.nasdanika.tests", "java.util.List");
		javaResource.getContents().add(cu);
		
		org.nasdanika.models.java.Class cls = org.nasdanika.models.java.Class.create("MyClass", "public"); 
		TypeParameter typeParameter = TypeParameter.create("T", GenericType.create("${import/java.util.Map}"));
		cls.getTypeParameters().add(typeParameter);
		org.nasdanika.models.java.Class nested = org.nasdanika.models.java.Class.create("Nested", "public", "static");
		cls.getMembers().add(nested);				
		
		cu.getTypes().add(cls);
		
		javaResource.save(null);
	}	
	
	
	
	@Test
	public void testImportPropertyComputer() {
		SimpleImportManager sim = new SimpleImportManager(null);
		sim.addImport("test.Map");
		MutableContext context = new SimpleMutableContext();
		context.put("import", new PropertyComputer() {
			
			@SuppressWarnings("unchecked")
			@Override
			public <T> T compute(Context context, String key, String path, Class<T> type) {		
				return (T) sim.addImport(path);
			}
		});
		
		String shortImport = context.interpolateToString("${import/java.util.Map}<String,Integer>");
		System.out.println(shortImport);
		System.out.println(sim.getImports());
	}

}
