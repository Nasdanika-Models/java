package org.nasdanika.models.java.cli;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.nasdanika.cli.CommandBase;
import org.nasdanika.cli.ParentCommands;
import org.nasdanika.cli.ProgressMonitorMixIn;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.models.coverage.Counter;
import org.nasdanika.models.coverage.Coverage;
import org.nasdanika.models.coverage.ModuleCoverage;
import org.nasdanika.models.java.Annotation;
import org.nasdanika.models.java.CompilationUnit;
import org.nasdanika.models.java.Interface;
import org.nasdanika.models.java.JavaFactory;
import org.nasdanika.models.java.Member;
import org.nasdanika.models.java.Method;
import org.nasdanika.models.java.Source;
import org.nasdanika.models.java.Type;
import org.nasdanika.models.java.util.JavaParserResourceFactory;
import org.nasdanika.models.java.util.ModuleCoverageProvider;
import org.nasdanika.ncore.Tree;
import org.nasdanika.ncore.TreeItem;
import org.nasdanika.ncore.util.DirectoryContentFileURIHandler;
import org.springframework.util.AntPathMatcher;

import picocli.CommandLine.Command;
import picocli.CommandLine.Mixin;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.ParentCommand;

@Command(
	description = "Loads coverage from jacoco.exec and classes directory",
	name = "jacoco",
	mixinStandardHelpOptions = true)
@ParentCommands(AbstractJUnitTestGeneratorCommand.class)
public class JacocoCommand extends CommandBase {

	@ParentCommand
	AbstractJUnitTestGeneratorCommand parent;	
		
	@Option(
			names = {"-j", "--jacoco"}, 
			description = {
					"jacoco.exec file path relative",
					"to the project directory,",
					"defaults to ${DEFAULT-VALUE}"
				}, 
			defaultValue = "target/jacoco.exec")
	private String jacoco;		
	
	@Option(
			names = {"-c", "--classes"}, 
			description = {
					"Classes directory path relative",
					"to the project directory,",
					"defaults to ${DEFAULT-VALUE}"
				}, 
			defaultValue = "target/classes")
	private String classes;
		
	@Option(names = {"-m", "--module"},	description = "Coverage module name")
	private String moduleName;		
	
	public ModuleCoverage loadCoverage(URI projectURI, ProgressMonitor progressMonitor) {
		projectURI.fi
		ModuleCoverage moduleCoverage = ModuleCoverage.loadJacoco(
				projectDir.getName(), 
				new File(projectDir, jacoco),
				new File(projectDir, classes));
		return moduleCoverage;
	}
	
	@Override
	public Integer call() throws Exception {
		try (ProgressMonitor progressMonitor = progressMonitorMixin.createProgressMonitor(1)) {	
			ResourceSet resourceSet = new ResourceSetImpl();
			
			// Loading coverage data
			
			Map<String, Object> extensionFactoryMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
	
			// Registering Java factory for loading java sources
			extensionFactoryMap.put(CompilationUnit.JAVA_EXTENSION, new JavaParserResourceFactory(new ModuleCoverageProvider(moduleCoverage)));
			
			// Registering XMI factory & URI handler for loading directory contents
			extensionFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
			resourceSet.getURIConverter().getURIHandlers().add(0, new DirectoryContentFileURIHandler());
			
			File outputDir = new File(projectDir, output); 
	    	URI sourceDirURI = URI.createFileURI(new File(projectDir, sources).getCanonicalPath()).appendSegment("");
	    	Resource sourceDirResource = resourceSet.getResource(sourceDirURI, true);
	    	int[] remaining = { limit };
	    	for (EObject root: sourceDirResource.getContents()) {
	    		 visit(root, sourceDirURI, outputDir, remaining, progressMonitor);
	    	}

	    	stats(progressMonitor);
	    	
			return 0;
		}
	}		

}
