package org.nasdanika.models.java.cli;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.nasdanika.cli.CommandBase;
import org.nasdanika.cli.ParentCommands;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.models.coverage.ModuleCoverage;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
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
		URI jacocoURI = URI.createURI(jacoco).resolve(projectURI);
		if (!jacocoURI.isFile()) {
			throw new IllegalArgumentException("Not a file: " + jacocoURI);
		}
		URI classesURI = URI.createURI(classes).resolve(projectURI);
		if (!classesURI.isFile()) {
			throw new IllegalArgumentException("Not a file: " + classesURI);
		}
		
		try {
			return ModuleCoverage.loadJacoco(
					Util.isBlank(moduleName) ? projectURI.toString() : moduleName, 
					new File(jacocoURI.toFileString()),
					new File(classesURI.toFileString()));
		} catch (IOException e) {
			throw new NasdanikaException("Error loading coverage from jacoco.exec and class files: " + e, e);
		}
	}
	
	@Override
	public Integer call() throws Exception {
		return parent.call(this::loadCoverage);
	}		

}
