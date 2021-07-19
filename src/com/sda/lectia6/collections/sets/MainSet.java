package com.sda.lectia6.collections.sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {

        Set<String> colours = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String colour = "";

        while (!colour.equals("stop")) {
            System.out.println("Enter a colour: ");
            colour = scanner.nextLine();
            colours.add(colour);
            for (String colourItem : colours) {
                System.out.println(colourItem);
            }

        }
    }
}
