package com.sda.coding_exercises.ex24;

public class BasketFullException extends RuntimeException{
    public BasketFullException() {
        super("Maximum items");
    }
}
