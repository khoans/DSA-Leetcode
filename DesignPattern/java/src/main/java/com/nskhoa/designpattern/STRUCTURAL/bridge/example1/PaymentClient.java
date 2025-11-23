package com.nskhoa.designpattern.STRUCTURAL.bridge.example1;

// Abstraction
public abstract class PaymentClient {
    protected PaymentMethod paymentMethod;

    protected PaymentClient(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    abstract void makePayment(double amount);
}
