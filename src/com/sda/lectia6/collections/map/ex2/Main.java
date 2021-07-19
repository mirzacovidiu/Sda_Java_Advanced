package com.sda.lectia6.collections.map.ex2;
//write a program which creates a concordance of characters occuring in a string
//read the string from the command line

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your input");
        String input = scanner.nextLine();

        Map<Character, List<Integer>> mapOcc = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
//            if(!mapOcc.containsKey(character)){
//                mapOcc.put(character, new ArrayList<>());//initializeaza un empthy array list
//            } SAU ...


            mapOcc.putIfAbsent(character, new ArrayList<>());//...SAU asa

            mapOcc.get(character).add(i);
        }
        System.out.println(mapOcc);


    }
}
