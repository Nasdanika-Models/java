package org.nasdanika.models.java.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;
import org.nasdanika.models.java.JavaPackage;

@EPackageNodeProcessorFactory(nsURI = JavaPackage.eNS_URI)
public class EcoreGenJavaProcessorsFactory {

	private Context context;
	
	public EcoreGenJavaProcessorsFactory(Context context) {
		this.context = context;
	}
	

}
