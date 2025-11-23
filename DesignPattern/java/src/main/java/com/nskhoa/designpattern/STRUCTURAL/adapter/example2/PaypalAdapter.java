package com.nskhoa.designpattern.STRUCTURAL.adapter.example2;

// Adapter wrapping either one
public class PaypalAdapter implements PaymentGateway {
    private PayPal paypal = new PayPal();
    public void pay(double amount) {
        paypal.sendPayment(amount);
    }
}
