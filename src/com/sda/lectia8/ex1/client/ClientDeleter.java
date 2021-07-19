package com.sda.lectia8.ex1.client;

import com.sda.lectia8.ex1.Main;

import java.util.Random;

public class ClientDeleter extends Thread{
    private static final Random RAND = new Random();

    @Override
    public  void run(){

        while (true){
            try {
            Thread.sleep(50);
            int indexToBeDeleted = RAND.nextInt(Main.PERSON_REPOSITORY.getSize() + 1);
            Main.PERSON_REPOSITORY.deletePersonById(indexToBeDeleted);
                System.out.println("Person deleted is: " + indexToBeDeleted);

        } catch (InterruptedException e){
            e.printStackTrace();
        }
        }

    }

}