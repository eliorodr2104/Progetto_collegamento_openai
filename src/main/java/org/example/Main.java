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