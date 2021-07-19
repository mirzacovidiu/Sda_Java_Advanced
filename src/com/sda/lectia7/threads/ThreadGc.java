package com.sda.lectia7.threads;

public class ThreadGc implements Runnable{
    @Override
    public void run() {
        System.gc();//invoca garbage colector
        System.out.println("garbage colector has been invoked");
    }
}
