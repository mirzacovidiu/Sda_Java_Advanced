package com.sda.coding_exercises.ex36;


public class ThreadPlaygroundRunnable implements Runnable{
    private String name;

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            try {
//                Thread.sleep(50);
//                System.out.println(Thread.currentThread().getName()+ " " + this.name + " " + i);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+ " " + this.name + " " + i);
        }
    }
}
