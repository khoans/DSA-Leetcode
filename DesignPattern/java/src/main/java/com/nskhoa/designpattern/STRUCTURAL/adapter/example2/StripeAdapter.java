package com.nskhoa.designpattern.STRUCTURAL.adapter.example2;

public class StripeAdapter implements PaymentGateway {
    private Stripe stripe = new Stripe();
    public void pay(double amount) {
        stripe.makePayment(amount);
    }
}
