package org.nasdanika.models.java.cli;

import org.nasdanika.cli.CommandGroup;
import org.nasdanika.cli.ParentCommands;
import org.nasdanika.cli.RootCommand;

import picocli.CommandLine.Command;

@Command(
		description = "Commands related to Java",
		name = "java",
		versionProvider = VersionProvider.class,		
		mixinStandardHelpOptions = true)
@ParentCommands(RootCommand.class)
public class JavaCommand extends CommandGroup {
	

}
