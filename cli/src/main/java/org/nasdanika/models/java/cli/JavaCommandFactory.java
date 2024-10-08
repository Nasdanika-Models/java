package org.nasdanika.models.java.cli;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import org.nasdanika.cli.SubCommandCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

import picocli.CommandLine;

public class JavaCommandFactory extends SubCommandCapabilityFactory<JavaCommand> {

	@Override
	protected Class<JavaCommand> getCommandType() {
		return JavaCommand.class;
	}
	
	@Override
	protected CompletionStage<JavaCommand> doCreateCommand(
			List<CommandLine> parentPath,
			Loader loader,
			ProgressMonitor progressMonitor) {
		return CompletableFuture.completedStage(new JavaCommand());
	}

}
