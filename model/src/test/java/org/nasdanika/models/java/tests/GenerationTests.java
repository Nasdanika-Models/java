package org.nasdanika.models.java.tests;

import java.io.File;
import java.nio.charset.StandardCharsets;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.Test;
import org.nasdanika.models.coverage.Coverage;
import org.nasdanika.models.java.GenerationMode;
import org.nasdanika.models.java.Type;
import org.nasdanika.models.java.util.JavaParserResourceFactory;

import com.google.common.io.Files;

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
		Files.asCharSink(javaSource, StandardCharsets.UTF_8).write(
				"""
				package org.nasdanika.test;	
					
				public class Element<T extends Map> {
						
					private void matchPredicate(T map, Object<? extends String> obj, String expr) {
						
					}
							
				}
				""");		
		
		Resource javaResource = resourceSet.getResource(URI.createFileURI(javaSource.getCanonicalPath()), true);		
		for (EObject root: javaResource.getContents()) {
			System.out.println(root);
			org.nasdanika.models.java.CompilationUnit cu = (org.nasdanika.models.java.CompilationUnit) root;
			cu.setGenerationMode(GenerationMode.MERGE);
		}		

		javaResource.save(null);
	}		

}
