package org.example;

import com.theokanning.openai.completion.CompletionChoice;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var prova = "";
        var scanner = new Scanner(System.in);

        prova = scanner.nextLine();

        OpenAi openAi = new OpenAi(prova,
                "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");

        openAi.risultatoOpenAi();
    }
}