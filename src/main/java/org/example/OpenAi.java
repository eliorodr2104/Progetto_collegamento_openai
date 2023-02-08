package org.example;

import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.completion.CompletionChoice;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.edit.EditRequest;

import java.net.SocketTimeoutException;
import java.util.List;
import java.util.concurrent.TimeoutException;

public class OpenAi {
    private String inputOpenAi, outputOpenAi;
    private OpenAiService openAiService;

    public OpenAi(String inputOpenAi, String tokenApi){
        this.inputOpenAi = inputOpenAi;
        this.outputOpenAi = "";
        this.openAiService = new OpenAiService(tokenApi);
    }

    public void risultatoOpenAi(){
        EditRequest editRequest = EditRequest.builder()
                .input(inputOpenAi)
                .model("text-davinci-003")
                .instruction("Traduci allo spagnolo")
                .build();

        CompletionRequest completionRequest = CompletionRequest.builder()
                .prompt(inputOpenAi)
                .model("text-davinci-003")
                .echo(false)
                .maxTokens(1500)
                .topP(1.0)
                .temperature(0.7)
                .build();

        try{
            openAiService.createCompletion(completionRequest).getChoices().forEach(System.out::println);
        }catch (Exception e){
            System.out.println("Prova: ");
            risultatoOpenAi();
        }
        //openAiService.createEdit(editRequest).getChoices().forEach(System.out::println);
    }

    public void setInputOpenAi(String inputOpenAi) {
        this.inputOpenAi = inputOpenAi;
    }
}
