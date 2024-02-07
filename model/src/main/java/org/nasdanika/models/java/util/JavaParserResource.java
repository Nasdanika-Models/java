package org.nasdanika.models.java.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.nasdanika.models.java.JavaFactory;

import com.github.javaparser.ast.body.TypeDeclaration;

public class JavaParserResource extends ResourceImpl {

	protected JavaParserResource() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected JavaParserResource(URI uri) {
		super(uri);
	}
	
	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		org.nasdanika.models.java.CompilationUnit modelCompilationUnit = createCompilationUnit();
		com.github.javaparser.ast.CompilationUnit jpCompilationUnit = com.github.javaparser.StaticJavaParser.parse(inputStream);
		load(jpCompilationUnit, modelCompilationUnit);
		getContents().add(modelCompilationUnit);
	}
	
	protected org.nasdanika.models.java.CompilationUnit createCompilationUnit() {
		return JavaFactory.eINSTANCE.createCompilationUnit();
	}
	
	protected void load(
			com.github.javaparser.ast.CompilationUnit jpCompilationUnit, 
			org.nasdanika.models.java.CompilationUnit modelCompilationUnit) {
						
		for (TypeDeclaration<?> td: jpCompilationUnit.getTypes()) {
			System.out.println(td.getFullyQualifiedName());
		}
		// TODO
	}

}
