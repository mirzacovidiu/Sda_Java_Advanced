package com.sda.billApp;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private double amountCollected;
    private Bill bill;
    private final List<PayableType> payableTypes = new ArrayList();

    public Payment(Bill bill) {
        this.bill = bill;
    }

    public boolean isBillPayed() {
        return this.amountCollected >= bill.getAmount();
    }

    public void addNewPayableType(PayableType payableType) {
        if (!payableType.isFake()) {
            payableTypes.add(payableType);
        }
        this.amountCollected += payableType.getValue();
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amountCollected=" + amountCollected +
                ", bill=" + bill +
                ", payableTypes=" + payableTypes +
                '}';
    }

    public double getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(int amountCollected) {
        this.amountCollected = amountCollected;
    }


    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}

  /*  public boolean isBillPayed() {
        return amountCollected >= bill.getAmount(); //Vrem sa verificam daca banii introdusi pt paymentul asta sunt suficienti
    }
}*/

    /*public void addNewPayableType(PayableType paymentType) throws FakePayableException {


        if (!paymentType.isFake()) {
            payableTypes.add(paymentType);

            amountCollected += paymentType.getValue();
        } else {
            throw new FakePayableException(paymentType);
        }
    }
}*/
