package com.nskhoa.designpattern.STRUCTURAL.adapter.example2;

public class Client {
    public static void main(String[] args) {
        PaymentGateway paypalPayment = new PaypalAdapter();
        paypalPayment.pay(100.0);

        PaymentGateway stripePayment = new StripeAdapter();
        stripePayment.pay(200.0);
    }
}
