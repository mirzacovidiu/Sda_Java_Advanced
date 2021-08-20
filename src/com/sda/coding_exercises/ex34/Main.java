package com.sda.coding_exercises.ex34;

/**
 * Create a class that extends the Thread class, e.g. MyThread, overload the run() method so it displays the
 * thread name in the console by reading it from the static method of the current thread:
 * Thread.currentThread().getName()
 * Create a class with the public static void main (String [] args) method.
 * Inside the main method create a type variable of our class created above, e.g. MyThread and initialize the class.
 * Perform the start() method on the variable.
 */
public class Main {
    public static void main(String[] args) {
//        Thread thread1 = new MyThread();
//        thread1.start();
//        Thread thread2 = new MyThread();
//        thread2.start();
//        Thread thread3 = new MyThread();
//        thread3.start();
//        Thread thread4 = new MyThread();
//        thread4.start();

        for (int i = 0; i < 10; i++) {
            Thread thread = new MyThread();
            thread.start();
        }
    }
}
