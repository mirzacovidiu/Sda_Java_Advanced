package com.sda.billApp;

public abstract class Banknote implements PayableType {

    private int length;
    private int width;
    private int receivedHeight;
    private int receivedWidth;

    public Banknote(int length, int width, int receivedHeight, int receivedWidth) {
        this.length = length;
        this.width = width;
        this.receivedHeight = receivedHeight;
        this.receivedWidth = receivedWidth;
    }

    @Override
    public boolean isFake() {
        return !(length == receivedHeight && width == receivedWidth);//In loc de if statement
    }



}
