import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.java.cli.JacocoCommandFactory;
import org.nasdanika.models.java.cli.JavaCommandFactory;
import org.nasdanika.models.java.cli.OpenAIJUnitTestGeneratorCommandFactory;

module org.nasdanika.models.java.cli {
	
	exports org.nasdanika.models.java.cli;

	requires transitive org.nasdanika.models.java;		
	requires transitive org.nasdanika.models.gitlab.cli;
	requires spring.core;
	requires org.apache.commons.lang3;
	requires transitive com.azure.ai.openai;
	requires org.eclipse.emf.ecore.xmi;
	
	opens org.nasdanika.models.java.cli to info.picocli, org.nasdanika.models.app.gen.cli;
	
	provides CapabilityFactory with 
		JavaCommandFactory,
		JacocoCommandFactory,
		OpenAIJUnitTestGeneratorCommandFactory;

}
