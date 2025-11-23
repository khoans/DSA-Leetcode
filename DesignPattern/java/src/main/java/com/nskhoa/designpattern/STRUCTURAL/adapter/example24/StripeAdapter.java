package com.nskhoa.designpattern.STRUCTURAL.adapter.example24;

public class StripeAdapter implements PaymentProcessor {
    private StripeProcessor stripe = new StripeProcessor();

    public void processPayment(double amount) {
        stripe.stripePay(amount);
    }
}
