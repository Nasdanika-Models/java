package org.nasdanika.models.java.cli;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import org.nasdanika.cli.RootCommand;
import org.nasdanika.cli.SubCommandCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

import picocli.CommandLine;

public class JavaCommandFactory extends SubCommandCapabilityFactory<JavaCommand> {

	@Override
	protected CompletionStage<JavaCommand> createCommand(
			List<CommandLine> parentPath, 
			Loader loader,
			ProgressMonitor progressMonitor) {
		if (parentPath != null && parentPath.size() == 1 && parentPath.get(0).getCommandSpec().userObject() instanceof RootCommand) {
			return CompletableFuture.completedStage(new JavaCommand());			
		}
		return null;
	}

	@Override
	protected Class<JavaCommand> getCommandType() {
		return JavaCommand.class;
	}

}
