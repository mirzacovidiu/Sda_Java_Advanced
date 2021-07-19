package com.sda.lectia6.input_output.newio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        /*Path absolutePath = Paths.get("src/file.txt");
        Path relativePath = Paths.get("file.txt");*/
       // Path path = Paths.get("src/file.txt");

        Path path = Paths.get("src/file3.txt");
        List<String> fileLines = Files.readAllLines(path);
        for(String fileLine: fileLines) {
            System.out.println(fileLine);
        }

        List<String> fileLinesWithCharset = Files.readAllLines(path, StandardCharsets.UTF_8);

        List<String> fileLinesToWrite = Arrays.asList("first line", "second line");
        Files.write(path, fileLinesToWrite);

        Files.write(path, fileLinesToWrite, StandardOpenOption.APPEND);


       /* List<String> fileLines = Files.readAllLines(path);
        List<String> fileLinesWithCharset = Files.readAllLines(absolutePath, StandardCharsets.UTF_8);

        List<String> fileLinesToWrite = Arrays.asList("first line", "second line");
        Files.write(path, fileLinesToWrite);

        Files.write(absolutePath, fileLinesToWrite, StandardOpenOption.APPEND);*/
    }
}
