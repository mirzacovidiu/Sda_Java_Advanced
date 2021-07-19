package com.sda.lectia6.input_output.ex3;

//Write a Java program to find the longest word in a text file.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/file.txt");
        if(!path.toFile().exists()){
            System.out.println("File not found");
            return;
        }
        List<String> lines = Files.readAllLines(path);
        String max = "";
        for(String line: lines){

            for(String word: line.split(" ")){
                if(word.length() > max.length()){
                    max = word;
                }
            }
        }
        System.out.println("Max word: " + max);
    }
}
