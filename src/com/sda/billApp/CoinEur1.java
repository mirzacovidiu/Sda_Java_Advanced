package com.sda.billApp;

public class CoinEur1 extends Coin{
    public CoinEur1(int weight, int radius, int receivedWeight, int receivedRadius) {
        super(1, 1, receivedWeight, receivedRadius);
    }

    @Override
    public int getValue() {
        return 1;
    }

    @Override
    public CurrencyType getCurrency() {
        return CurrencyType.EUR;
    }
}
