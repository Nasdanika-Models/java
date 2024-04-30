import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.java.cli.JavaCommandFactory;

module org.nasdanika.models.java.cli {

	requires org.nasdanika.models.java;		
	requires org.nasdanika.cli;
	requires spring.core;
	requires org.apache.commons.lang3;
	requires com.azure.ai.openai;
	requires org.eclipse.emf.ecore.xmi;
	requires org.nasdanika.common;
	
	opens org.nasdanika.models.java.cli to info.picocli;
	
	provides CapabilityFactory with JavaCommandFactory;

}
