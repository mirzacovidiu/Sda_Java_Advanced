package com.sda.billApp;

public class BanknoteEuro20 extends Banknote{
    public BanknoteEuro20(int length, int width, int receivedHeight, int receivedWidth) {
        super(5, 4, receivedHeight, receivedWidth);
    }

    @Override
    public double getValue() {
        return 20;
    }

    @Override
    public CurrencyType getCurrency() {
        return CurrencyType.EUR;
    }
}
