package com.sda.billApp;

public class BanknoteEuro50 extends Banknote{

    public BanknoteEuro50(int receivedHeight, int receivedWidth) {
        super(10, 5, receivedHeight, receivedWidth);
    }

    @Override
    public int getValue() {
        return 50;
    }

    @Override
    public CurrencyType getCurrency() {
        return CurrencyType.EUR;
    }
}
