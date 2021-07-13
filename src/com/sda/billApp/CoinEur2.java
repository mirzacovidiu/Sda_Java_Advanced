package com.sda.billApp;

public class CoinEur2 extends Coin{
    public CoinEur2(int weight, int radius, int receivedWeight, int receivedRadius) {
        super(1, 2, receivedWeight, receivedRadius);
    }

    @Override
    public double getValue() {
        return 2;
    }

    @Override
    public CurrencyType getCurrency() {
        return CurrencyType.EUR;
    }
}
