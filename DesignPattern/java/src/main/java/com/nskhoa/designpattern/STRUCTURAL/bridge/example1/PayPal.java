package com.nskhoa.designpattern.STRUCTURAL.bridge.example1;

public class PayPal implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with PayPal.");
    }
}
