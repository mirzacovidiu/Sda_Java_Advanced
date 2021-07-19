package com.sda.lectia6.collections.map.ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//sa afisam de cate ori a aparut un caracter intr-un string
//citetim stringul de la tastatura
//
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your input");
        String input = scanner.nextLine();

        Map<Character, Integer> numberOfOccc = new HashMap<>();

        for (int i = 0; i<input.length(); i++){
            char character = input.charAt(i);
            if(numberOfOccc.containsKey(character)){
                int value = numberOfOccc.get(character);
                numberOfOccc.put(character, value+1);
            }else{
                numberOfOccc.put(character,1);
            }
        }
        System.out.println(numberOfOccc);


    }
}
