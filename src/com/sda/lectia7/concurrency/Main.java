package com.sda.lectia7.concurrency;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starts");
        Thread.sleep(5000L);
        System.out.println("Main thread is still running");
        Thread.sleep(5000L);
        System.out.println("Main thread ends");
    }
}
