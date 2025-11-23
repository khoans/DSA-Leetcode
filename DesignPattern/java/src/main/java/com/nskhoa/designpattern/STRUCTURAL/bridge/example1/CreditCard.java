package com.nskhoa.designpattern.STRUCTURAL.bridge.example1;

// Concrete Implementors
public class CreditCard implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with credit card.");
    }
}
