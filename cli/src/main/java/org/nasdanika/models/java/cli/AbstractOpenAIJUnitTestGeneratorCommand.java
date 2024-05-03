package org.nasdanika.models.java.cli;

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

import picocli.CommandLine.Option;

/**
 * Base class for commands leveraging OpenAI API to generate test method body
 */
public abstract class AbstractOpenAIJUnitTestGeneratorCommand extends AbstractJUnitTestGeneratorCommand {
	
	protected abstract String getDeploymentOrModelName();
	
	protected abstract OpenAIClient getOpenAIClient(ProgressMonitor progressMonitor);

	protected abstract List<ChatRequestMessage> generateChatMessages(Method method,	ProgressMonitor progressMonitor);
		
	@Option(
			names = "--comment-response",
			negatable = true,
			description = "Overwrite existing tests",
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
		
	@Override
	protected String generateTestMethodBody(
			Method method, 
			String indent,
			org.nasdanika.models.java.Class testClass,			
			ProgressMonitor progressMonitor) {
		
		OpenAIClient openAIClient = getOpenAIClient(progressMonitor);
		if (openAIClient == null) {
			return null;
		}
		StringBuilder bodyBuilder = new StringBuilder();
		bodyBuilder
			.append(indent)
			.append(indent)
			.append("// *** Start generated test ***")
			.append(System.lineSeparator());
		
		// Calling OpenAI to generate test code
        List<ChatRequestMessage> chatMessages = generateChatMessages(method, progressMonitor);
        
        ChatCompletions chatCompletions = openAIClient.getChatCompletions(getDeploymentOrModelName(), new ChatCompletionsOptions(chatMessages));
        progressMonitor.worked(Status.SUCCESS, 1, "Received a response from OpenAI");
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

}
