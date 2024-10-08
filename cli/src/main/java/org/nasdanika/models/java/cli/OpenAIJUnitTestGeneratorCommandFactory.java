package org.nasdanika.models.java.cli;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import org.nasdanika.cli.SubCommandCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

import picocli.CommandLine;

public class OpenAIJUnitTestGeneratorCommandFactory extends SubCommandCapabilityFactory<OpenAIJUnitTestGeneratorCommand> {

	@Override
	protected Class<OpenAIJUnitTestGeneratorCommand> getCommandType() {
		return OpenAIJUnitTestGeneratorCommand.class;
	}
	
	@Override
	protected CompletionStage<OpenAIJUnitTestGeneratorCommand> doCreateCommand(
			List<CommandLine> parentPath,
			Loader loader,
			ProgressMonitor progressMonitor) {
		return CompletableFuture.completedStage(new OpenAIJUnitTestGeneratorCommand());
	}

}
