package com.sda.billApp;

public enum CurrencyType {

    EUR("Euro"),
    USD("Dollar"),
    RON("Leu"),
    SODEXO("Sodexo Ticket");
    private String name;

    CurrencyType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name ;
    }
}
