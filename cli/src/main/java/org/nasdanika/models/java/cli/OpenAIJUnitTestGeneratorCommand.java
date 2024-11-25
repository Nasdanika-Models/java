package org.nasdanika.models.java.cli;

import java.util.ArrayList;
import java.util.List;

import org.nasdanika.cli.Description;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Status;
import org.nasdanika.common.Util;
import org.nasdanika.models.java.Method;

import com.azure.ai.openai.OpenAIClient;
import com.azure.ai.openai.OpenAIClientBuilder;
import com.azure.ai.openai.models.ChatRequestMessage;
import com.azure.ai.openai.models.ChatRequestUserMessage;
import com.azure.core.credential.KeyCredential;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
		description = "Generates JUnit tests",
		versionProvider = VersionProvider.class,		
		mixinStandardHelpOptions = true,		
		name = "junit")
@Description(icon = "https://docs.nasdanika.org/images/JUnit.svg")
public class OpenAIJUnitTestGeneratorCommand extends AbstractOpenAIJUnitTestGeneratorCommand {
	
	@Option(
			names = {"-v", "--api-key-variable"}, 
			description = {
					"OpenAPI key environment variable",
					"defaults to ${DEFAULT-VALUE}"
				}, 
			defaultValue = "OPENAI_API_KEY")
	private String apiKeyEnvironmentVariable;		
	
	@Option(
			names = {"-k", "--api-key"}, 
			description = "OpenAPI key")
	private String apiKey;		
	
	@Option(
			names = "--api-endpoint", 
			description = {
					"OpenAPI endpoint, defaults to",
					"${DEFAULT-VALUE}"
				}, 
			defaultValue = "https://api.openai.com/v1/chat/completions")
	private String apiEndpoint;
		
	@Option(
			names = { "-m", "--model" }, 
			description = {
					"OpenAPI deployment or model",
					"defaults to ${DEFAULT-VALUE}"
				}, 
			defaultValue = "gpt-4")
	private String deploymentOrModelName;
	
	@Override
	protected String getDeploymentOrModelName() {
		return deploymentOrModelName;
	}
	
	@Option(
			names = { "-r", "--prompt" }, 
			description = {
					"Propmt",
					"defaults to '${DEFAULT-VALUE}'"
				}, 
			defaultValue = "Generate a JUnit 5 test method leveraging Mockito for the following Java method")
	private String prompt;	
	
	private OpenAIClient openAIClient;
	
	@Override
	public OpenAIClient getOpenAIClient(ProgressMonitor progressMonitor) {
		if (apiKey == null) {
			apiKey = System.getenv(apiKeyEnvironmentVariable);
		}
		if (openAIClient == null && !Util.isBlank(apiKey)) {
			openAIClient = new OpenAIClientBuilder()
					.credential(new KeyCredential(apiKey))
					.endpoint(apiEndpoint)
					.buildClient();
			progressMonitor.worked(Status.SUCCESS, 1, "Connected to OpenAI", apiEndpoint);
		}
			
		return openAIClient;
	}
	
	@Override
	protected List<ChatRequestMessage> generateChatMessages(Method method, ProgressMonitor progressMonitor) {
        List<ChatRequestMessage> chatMessages = new ArrayList<>();
        chatMessages.add(new ChatRequestUserMessage(prompt + ": ")); 
        chatMessages.add(new ChatRequestUserMessage(method.getSource()));
        return chatMessages;
	}

}
