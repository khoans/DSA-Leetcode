package com.nskhoa.designpattern.STRUCTURAL.adapter.example24;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor stripePayment = new StripeAdapter();
        PaymentProcessor paypalPayment = new PayPalAdapter();
        PaymentProcessor squarePayment = new SquareAdapter();

        stripePayment.processPayment(100.0);
        paypalPayment.processPayment(200.0);
        squarePayment.processPayment(300.0);
    }
}
