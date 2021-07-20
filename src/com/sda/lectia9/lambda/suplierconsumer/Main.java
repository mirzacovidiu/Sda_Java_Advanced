package com.sda.lectia9.lambda.suplierconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    private static List<String> cardNumbers = new ArrayList();

    public Main() {
    }

    public static void main(String[] args) {
        Supplier<Integer> randomNumberSupplier = () -> {
            return (new Random()).nextInt();
        };
        int randomNumber = (Integer) randomNumberSupplier.get();
        Consumer<Double> printWithPrefixConsumer = (d) -> {
            System.out.println("Value: " + d);
        };
        printWithPrefixConsumer.accept(10.5D);
    }
}
