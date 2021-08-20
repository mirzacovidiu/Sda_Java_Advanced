package com.sda.coding_exercises.ex38;


public class CoffeeMachine extends Thread{
    private int waterTank;

    public CoffeeMachine() {
        this.waterTank = 10;
    }

    @Override
    public void run() {
        while (true) {
            if (waterTank > 0) {
                System.out.println("Preparing coffee");
                waterTank--;
                System.out.println("Coffee is ready");
            } else {
                try {
                    System.out.println("Empty Water Tank");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public void fillWaterTank() {
        waterTank = 10;
    }
}