package org.nasdanika.models.java.cli;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import org.nasdanika.cli.SubCommandCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

import picocli.CommandLine;

public class JacocoCommandFactory extends SubCommandCapabilityFactory<JacocoCommand> {

	@Override
	protected Class<JacocoCommand> getCommandType() {
		return JacocoCommand.class;
	}
	
	@Override
	protected CompletionStage<JacocoCommand> doCreateCommand(
			List<CommandLine> parentPath,
			Loader loader,
			ProgressMonitor progressMonitor) {
		return CompletableFuture.completedStage(new JacocoCommand());
	}

}
