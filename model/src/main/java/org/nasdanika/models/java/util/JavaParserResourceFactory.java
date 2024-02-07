package org.nasdanika.models.java.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.models.java.CompilationUnit;
import org.nasdanika.models.java.JavaFactory;

public class JavaParserResourceFactory implements Resource.Factory {

	@Override
	public Resource createResource(URI uri) {
		return new JavaParserResource(uri) {
			
			@Override
			protected CompilationUnit createCompilationUnit() {
				return JavaParserResourceFactory.this.createCompilationUnit(this);
			}
			
		};
	}
	
	/**
	 * Override to customize creation of a compilation unit
	 * @param resource
	 * @return
	 */
	protected org.nasdanika.models.java.CompilationUnit createCompilationUnit(JavaParserResource resource) {
		return JavaFactory.eINSTANCE.createCompilationUnit();
	}

}
