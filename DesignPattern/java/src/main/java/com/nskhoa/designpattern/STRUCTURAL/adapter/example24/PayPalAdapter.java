package com.nskhoa.designpattern.STRUCTURAL.adapter.example24;

public class PayPalAdapter implements PaymentProcessor {
    private PayPalProcessor paypal = new PayPalProcessor();

    public void processPayment(double amount) {
        paypal.paypalPay(amount);
    }
}
