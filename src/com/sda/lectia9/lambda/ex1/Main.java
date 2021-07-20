package com.sda.lectia9.lambda.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void
    main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your thought: ");
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        List<String> newWords = new ArrayList<>();
        for (String word : words) {
            String newWord = word.trim();
            if (!newWord.isEmpty()) {
                newWords.add(newWord);
            }
        }
        processWords(newWords,
                word -> System.out.println(word),
                word ->word.toUpperCase());
    }

    public static void processWords(List<String> newWords, Consumer<String> wordConsumer, Function<String, String> wordTransformer) {
        for (String word : newWords) {
            wordConsumer.accept(wordTransformer.apply(word));
        }
    }
}
