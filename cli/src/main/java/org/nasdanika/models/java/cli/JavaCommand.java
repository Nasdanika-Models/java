package org.nasdanika.models.java.cli;

import org.nasdanika.cli.CommandGroup;

import picocli.CommandLine.Command;

@Command(
		description = "Commands related to Java",
		name = "java",
		versionProvider = VersionProvider.class,		
		mixinStandardHelpOptions = true,		
		subcommands = {
			JUnitTestGeneratorCommand.class
		})
public class JavaCommand extends CommandGroup {
	

}
