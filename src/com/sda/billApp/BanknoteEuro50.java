package com.sda.billApp;

public class BanknoteEuro50 extends Banknote{

    public BanknoteEuro50(double receivedLength, int receivedWidth) {
        super(10, 5, receivedLength, receivedWidth);
    }

    @Override
    public double getValue() {
        return 50;
    }

    @Override
    public CurrencyType getCurrency() {
        return CurrencyType.EUR;
    }
}
