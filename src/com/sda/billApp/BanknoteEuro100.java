package com.sda.billApp;

public class BanknoteEuro100 extends Banknote{
    public BanknoteEuro100(int length, int width, int receivedHeight, int receivedWidth) {
        super(20, 5, receivedHeight, receivedWidth);
    }

    @Override
    public double getValue() {
        return 100;
    }

    @Override
    public CurrencyType getCurrency() {
        return CurrencyType.EUR;
    }
}
