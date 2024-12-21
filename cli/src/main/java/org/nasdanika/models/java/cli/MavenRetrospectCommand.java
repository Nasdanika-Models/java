package org.nasdanika.models.java.cli;

import java.io.InputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.eclipse.emf.common.util.URI;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.cli.CommandBase;
import org.nasdanika.cli.ParentCommands;
import org.nasdanika.models.gitlab.Project;
import org.nasdanika.models.gitlab.cli.GitLabContributorCommand.Result;
import org.nasdanika.models.gitlab.cli.GitLabRetrospectCommand;
import org.nasdanika.models.gitlab.util.GitLabURIHandler;

import picocli.CommandLine.Option;
import picocli.CommandLine.ParentCommand;

/**
 * Base class for commands retrospecting Maven projects. 
 * This command reads pom.xml (configurable) and passes the loaded Maven project model 
 */
@ParentCommands(GitLabRetrospectCommand.class)
public abstract class MavenRetrospectCommand extends CommandBase {

	protected MavenRetrospectCommand() {
		
	}
	
	protected MavenRetrospectCommand(CapabilityLoader capabilityLoader) {
		super(capabilityLoader);
	}
	
	@Option(
			names = {"-p", "--pom"},
			description = "Pom file, defaults to ${DEFAULT-VALUE}")
	private String pom = "pom.xml";
	
	@ParentCommand
	private GitLabRetrospectCommand parent;
	
	protected <T> T apply(
			GitLabURIHandler gitLabURIHandler, 
			Date since, 
			Date until, 
			Project project) throws Exception {
		
		URI baseURI = URI.createURI(GitLabURIHandler.GITLAB_URI_SCHEME + "://" + project.getId() + "/" + URLEncoder.encode(parent.getRef(), StandardCharsets.UTF_8) + "/");
		URI pomURI = URI.createURI(pom).resolve(baseURI);
		MavenXpp3Reader mReader = new MavenXpp3Reader();
		try (InputStream in = gitLabURIHandler.createInputStream(pomURI, null)) {
			Model pomModel = mReader.read(in);
			return apply(gitLabURIHandler, since, until, project, baseURI, pomModel);
		}
		
	}
	
	protected abstract <T> T apply(
			GitLabURIHandler gitLabURIHandler, 
			Date since, 
			Date until, 
			Project project,
			URI baseURI,
			Model model) throws Exception;
	
	@Override
	public Integer call() throws Exception {
		Result<Object> result = parent.apply(this::apply);
		Object fResult = result.functionResult();
		return fResult instanceof Integer ? (Integer) fResult : 0;
	}
	

}
