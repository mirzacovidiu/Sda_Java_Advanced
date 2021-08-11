package com.sda.coding_exercises.ex27;


import com.sda.coding_exercises.ex18.Computer;
import com.sda.coding_exercises.ex19.Laptop;

/**
 * Design the Joiner<T> class, which in the constructor will take a separator (string) and have a join() method
 * that allows you to specify any number of T-type objects.
 * This method will return a string joining all passed elements by calling their toString() method and separating them with a separator.
 * eg. for Integers and separator "-" it should return: 1-2-3-4 ...
 */
public class Main {
    public static void main(String[] args) {
        Joiner<String> joiner = new Joiner<>("-");
        System.out.println(joiner.join("a", "b", "c"));

        Joiner<Computer> computerJoiner = new Joiner<>("***");
        Laptop laptop1 = new Laptop("3400", "64", "1800", "AMD", "DATASET", "5A");
        Laptop laptop2 = new Laptop("3240", "6", "1810", "AMFDD", "DATADSDDSET", "510A");
        System.out.println(computerJoiner.join(laptop1, laptop2));

    }
}