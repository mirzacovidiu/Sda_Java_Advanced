package com.sda.billApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BanknoteEuro50 eur50 = new BanknoteEuro50(2, 3);


        while (true) {

            Scanner sc = new Scanner(System.in);
            //read bill serial number
            //create payment object
            String serialNumber = sc.nextLine();
            Bill bill1 = new Bill(300);
            bill1.setSerialNumber(serialNumber);
            int billAmount = (int) ((Math.random() * 241) + 10);
            bill1.setAmount(billAmount);
            bill1.setCurrency(CurrencyType.EUR);
            Payment paymentBill = new Payment(bill1);
            while (!paymentBill.isBillPayed()) {
                //ask for money
            }
            int banknoteValue = sc.nextInt();
 /*       Bill bill1 = new Bill(70);
        Payment paymentBill = new Payment(bill1);
        paymentBill.addNewPayableType(eur50);
        paymentBill.addNewPayableType(eur50);
        System.out.println(paymentBill.isBillPayed());
}*/
        }
    }
}

