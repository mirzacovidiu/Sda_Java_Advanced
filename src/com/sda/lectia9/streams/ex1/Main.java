package com.sda.lectia9.streams.ex1;
/*
List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes")
        - Print All Courses individually
        - Print Courses Containing the word "Spring"
        - Print Courses Whose Name has at least 4 letters
        - Print the number of characters in each course name
*/
/*
Write a program that reads a collection of strings, separated by one or more whitespaces, from the console and then prints
        them onto the console. Each string should be printed on a new line. Use a Consumer<T>.
        - Input: Pesho Gosho Adasha
        - Output:
        - Pesho
        - Gosho
        - Adasha
*/
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        courses.stream().forEach(word
                -> System.out.println(word));
        System.out.println("-----------------------");
        courses.stream().filter(word
                -> word.contains("Spring"))
                .forEach(word
                        -> System.out.println(word));
        System.out.println("-----------------------");
        courses.stream()
                .filter(word
                        -> word.length() > 4)
                .forEach(word
                        -> System.out.println(word));
        System.out.println("-----------------------");
        courses.stream().forEach(word -> System.out.println(word.length()));
        System.out.println("-----------------------");
        courses.stream()
                .sorted((word1, word2) ->Integer.compare(word2.length(), word1.length()))
                .findFirst().ifPresent(word-> System.out.println(word));
  //      .forEach(word-> System.out.println(word));


    }

}