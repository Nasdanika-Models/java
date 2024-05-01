package org.nasdanika.models.java.cli.tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.nasdanika.models.java.cli.OpenAIJUnitTestGeneratorCommand;

import picocli.CommandLine;

public class TestOpenAIJUnitTestGeneratorCommand {
	
	@Disabled
	@Test
	public void testHelp() {
		CommandLine commandLine = new CommandLine(new OpenAIJUnitTestGeneratorCommand());
		commandLine.execute("-h");
	}

}
