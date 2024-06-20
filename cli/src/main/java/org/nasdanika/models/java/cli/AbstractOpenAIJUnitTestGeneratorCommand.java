package org.nasdanika.models.java.cli;

import java.util.ArrayList;
import java.util.List;

import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Status;
import org.nasdanika.common.Util;
import org.nasdanika.models.java.Method;

import com.azure.ai.openai.OpenAIClient;
import com.azure.ai.openai.models.ChatChoice;
import com.azure.ai.openai.models.ChatCompletions;
import com.azure.ai.openai.models.ChatCompletionsOptions;
import com.azure.ai.openai.models.ChatRequestMessage;
import com.azure.ai.openai.models.ChatResponseMessage;
import com.azure.ai.openai.models.CompletionsUsage;

import picocli.CommandLine.Option;
import picocli.CommandLine.ParameterException;

/**
 * Base class for commands leveraging OpenAI API to generate test method body
 */
public abstract class AbstractOpenAIJUnitTestGeneratorCommand extends AbstractJUnitTestGeneratorCommand {
	
	protected abstract String getDeploymentOrModelName();
	
	protected abstract OpenAIClient getOpenAIClient(ProgressMonitor progressMonitor);

	protected abstract List<ChatRequestMessage> generateChatMessages(Method method,	ProgressMonitor progressMonitor);
	
	protected List<CompletionsUsage> usage = new ArrayList<>();
		
	@Option(
			names = "--comment-response",
			negatable = true,
			description = {
					"Comment AI responses",
					"defaults to ${DEFAULT-VALUE}"
			},
			defaultValue = "true")
	private boolean commentResponse;		
	
	/**
	 * Override to process response such as extract code, add imports, ...
	 * @param response
	 * @param testClass
	 * @param progressMonitor
	 * @return
	 */
	protected String processResponse(
			String response,
			org.nasdanika.models.java.Class testClass, 
			ProgressMonitor progressMonitor) {
		return response;
	}
	
	@Option(
			names = "--ai",
			negatable = true,
			description = "Use AI, defaults to ${DEFAULT-VALUE}",
			defaultValue = "true")
	private boolean useAI;			
		
	@Override
	protected String generateTestMethodBody(
			Method method, 
			String indent,
			org.nasdanika.models.java.Class testClass,			
			ProgressMonitor progressMonitor) {
		
		if (!useAI) {
			return null;
		}
		OpenAIClient openAIClient = getOpenAIClient(progressMonitor);
		if (openAIClient == null) {
			throw new ParameterException(spec.commandLine(), "Use AI is set to true, but OpenAI client is not available. Make sure that an API key is provided as an option or in an environment variable.");
		}
		StringBuilder bodyBuilder = new StringBuilder();
		bodyBuilder
			.append(indent)
			.append(indent)
			.append("// *** Start generated test ***")
			.append(System.lineSeparator());
		
		// Calling OpenAI to generate test code
        List<ChatRequestMessage> chatMessages = generateChatMessages(method, progressMonitor);
        
        ChatCompletions chatCompletions = openAIClient.getChatCompletions(getDeploymentOrModelName(), createChatCompletions(chatMessages));
        CompletionsUsage usage = chatCompletions.getUsage();
        progressMonitor.worked(Status.SUCCESS, 1, "Received a response from OpenAI", usage);
        usage(usage);
        for (ChatChoice choice : chatCompletions.getChoices()) {
            ChatResponseMessage message = choice.getMessage();
            String generatedTestCase = processResponse(message.getContent(), testClass, progressMonitor);
            if (!Util.isBlank(generatedTestCase)) {
            	String[] lines = generatedTestCase.split("\\R");					            	
            	for (String line: lines) {
		            bodyBuilder
		            	.append(indent)
		            	.append(indent);
		            
		            if (commentResponse) {
		            	bodyBuilder.append("// "); 
		            }
		            	
		            bodyBuilder
		            	.append(line)
		            	.append(System.lineSeparator());
            	}
            }
        }

		bodyBuilder
			.append(indent)
			.append(indent)
			.append("// *** End generated test ***")
			.append(System.lineSeparator());
		
		return bodyBuilder.toString();
	}
	
	protected void usage(CompletionsUsage usage) {
		this.usage.add(usage);
	}

	/**
	 * Creates chat completions. Override to customize, e.g. set model name.
	 * @param chatMessages
	 * @return
	 */
	protected ChatCompletionsOptions createChatCompletions(List<ChatRequestMessage> chatMessages) {
		return new ChatCompletionsOptions(chatMessages);
	}
	
	@Override
	protected void stats(ProgressMonitor progressMonitor) {
		super.stats(progressMonitor);
		if (!usage.isEmpty()) {
			int completionTokens = 0;
			int promptTokens = 0;
			int totalTokens = 0;
			for (CompletionsUsage ue: usage) {
				completionTokens += ue.getCompletionTokens();
				promptTokens += ue.getPromptTokens();
				totalTokens += ue.getTotalTokens();
			}
			progressMonitor.worked(Status.INFO, 1, "Token usage: prompt - " + promptTokens + ", completion - " + completionTokens + ", total - " + totalTokens,  promptTokens, completionTokens, totalTokens);
		}
	}

}
