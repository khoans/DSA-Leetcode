package com.nskhoa.designpattern.STRUCTURAL.adapter.example2;

// Adaptee classes with different APIs
public class PayPal {
    void sendPayment(double amount) {
        System.out.println("PayPal processing payment: $" + amount);
    }
}
