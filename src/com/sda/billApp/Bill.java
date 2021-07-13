package com.sda.billApp;

public class Bill {
    private String serialNumber;
    private double amount;
    private CurrencyType currency;

    public Bill( double amount) {
        this.amount = amount;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setCurrency(CurrencyType currency) {
        this.currency = currency;
    }
}
