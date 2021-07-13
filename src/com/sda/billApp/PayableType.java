package com.sda.billApp;

public interface PayableType {

    double getValue();

    CurrencyType getCurrency();

    boolean isFake();


}
