/**
 */
package org.nasdanika.models.java.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.java.JavaPackage;

@EClassifierNodeProcessorFactory(classifierID = JavaPackage.COMPILATION_UNIT)
public class CompilationUnitProcessorFactory extends SourceProcessorFactory {

	public CompilationUnitProcessorFactory(Context context) {
		super(context);
	}

//	EList<Type> getTypes();
//	String getPackageName();
//  TODO - imports	

//  TODO - merge to source? Merge provider for type	
//	void merge(String source, BiFunction<String, String, String> merger);
//	void merge(BiFunction<String, String, String> merger);
	
} // CompilationUnit
