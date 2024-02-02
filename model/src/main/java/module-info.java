module org.nasdanika.models.java {
	
	exports org.nasdanika.models.java;
	exports org.nasdanika.models.java.impl;
	exports org.nasdanika.models.java.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.ncore;

}