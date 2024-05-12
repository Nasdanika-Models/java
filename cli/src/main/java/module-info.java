import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.java.cli.JavaCommandFactory;

module org.nasdanika.models.java.cli {
	
	exports org.nasdanika.models.java.cli;

	requires transitive org.nasdanika.models.java;		
	requires transitive org.nasdanika.cli;
	requires spring.core;
	requires org.apache.commons.lang3;
	requires transitive com.azure.ai.openai;
	requires org.eclipse.emf.ecore.xmi;
	
	opens org.nasdanika.models.java.cli to info.picocli, org.nasdanika.html.model.app.gen.cli;
	
	provides CapabilityFactory with JavaCommandFactory;

}
