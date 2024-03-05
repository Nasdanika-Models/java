package org.nasdanika.models.java.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.models.java.CompilationUnit;
import org.nasdanika.models.java.JavaFactory;

public class JavaParserResourceFactory implements Resource.Factory {
	
	private String complianceLevel;
	
	public JavaParserResourceFactory() {
		this("17");
	}

	/**
	 * @param complianceLevel Compliance level. E.g. "1.4", "17" (default)
	 */
	public JavaParserResourceFactory(String complianceLevel) {
		this.complianceLevel = complianceLevel;
	}

	@Override
	public Resource createResource(URI uri) {
		return new JavaParserResource(uri, getComplianceLevel()) {
			
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
	
	public String getComplianceLevel() {
		return complianceLevel;
	}

}
