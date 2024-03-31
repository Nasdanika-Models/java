/**
 */
package org.nasdanika.models.java.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.java.JavaPackage;

@EClassifierNodeProcessorFactory(classifierID = JavaPackage.SOURCE)
public class SourceProcessorFactory {
	
	protected Context context;
	
	public SourceProcessorFactory(Context context) {
		this.context = context;
	}	

//	String getSource();
//	EList<Source> getChildren();
//	Coverage getCoverage();
//	String update(Function<String, String> importManager);
//	String digest(Predicate<EObject> predicate);

} // Source
