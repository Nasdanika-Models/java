module org.nasdanika.models.java.processors {
		
	requires transitive org.nasdanika.models.java;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.java.processors.ecore;
	opens org.nasdanika.models.java.processors.ecore; // For loading resources
	
}
