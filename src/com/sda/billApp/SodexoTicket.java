package com.sda.billApp;

public class SodexoTicket extends Ticket{
    public SodexoTicket(String serialNumber, String receivedSerialNumber) {
        super("12345678", "123445678");
    }

    @Override
    public int getValue() {
        return 10;
    }

    @Override
    public CurrencyType getCurrency() {
        return CurrencyType.SODEXO;
    }
}
