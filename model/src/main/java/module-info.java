module org.nasdanika.models.java {
	
	exports org.nasdanika.models.java;
	exports org.nasdanika.models.java.impl;
	exports org.nasdanika.models.java.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.ncore;
	requires com.github.javaparser.core;
	requires transitive org.eclipse.emf.codegen;
	requires transitive org.eclipse.emf.codegen.ecore;
	requires transitive org.eclipse.jdt.core;
	requires transitive org.eclipse.core.runtime;

}