package org.nasdanika.models.java.util;

import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.capability.CapabilityFactory.Loader;
import org.nasdanika.capability.emf.ResourceFactoryCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

public class JavaResourceFactoryCapabilityFactory extends ResourceFactoryCapabilityFactory {

	@Override
	protected Factory getResourceFactory(
			ResourceSet resourceSet, 
			Loader loader,
			ProgressMonitor progressMonitor) {
		return new JavaParserResourceFactory();
	}
	
	@Override
	protected String getExtension() {
		return "java";
	}

}
