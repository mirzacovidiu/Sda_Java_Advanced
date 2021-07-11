package com.sda.billApp;

public abstract class Coin implements PayableType{

    private int weight;
    private int radius;
    private int receivedWeight;
    private int receivedRadius;

    public Coin(int weight, int radius, int receivedWeight, int receivedRadius) {

        this.weight = weight;
        this.radius = radius;
        this.receivedWeight = receivedWeight;
        this.receivedRadius = receivedRadius;
    }
        @Override
        public boolean isFake(){
            return !(radius == receivedRadius && weight == receivedWeight);
        }

    }

