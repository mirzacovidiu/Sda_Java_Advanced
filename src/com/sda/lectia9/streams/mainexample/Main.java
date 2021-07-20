package com.sda.lectia9.streams.mainexample;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static final List<String> names = Arrays.asList("Andrew", "Andrew", "Aaaadrew", "Brandon", "Michael", "Kelbee", "Reese", "Obie", "Krisha", "Blondie", "Emmy", "Claire", "Karlyn", "Jesselyn", "Dionis", "Wadsworth", "Davita", "Ardisj", "Klement", "Cynde", "Delia", "Gracie", "Gertie", "Willette", "Cherr", "", "", null);


    public static void main(String[] args) throws IOException {
        Stream<String> streamOfArray = Stream.of("a", "b", "c");
        Stream<String> streamGenerated = Stream.generate(() -> {
            return "element";
        }).limit(10L);
        Path path = Paths.get("C:\\file.txt");
        Stream<String> streamOfStrings = Files.lines(path);
        Stream<String> streamWithCharset = Files.lines(path, StandardCharsets.UTF_8);
        List<String> strings = (List)names.stream().filter((string) -> {
            return string != null;
        }).filter((string) -> {
            return !string.isEmpty();
        }).filter((string) -> {
            return string.startsWith("C");
        }).sorted().limit(12L).skip(6L).distinct().collect(Collectors.toList());
        PrintStream var10001 = System.out;
        strings.forEach(var10001::println);
        Optional<String> anyElement = names.stream().findAny();
        var10001 = System.out;
        anyElement.ifPresent(var10001::println);
        Optional<String> firstElement = names.stream().findFirst();
        var10001 = System.out;
        firstElement.ifPresent(var10001::println);
    }
}
