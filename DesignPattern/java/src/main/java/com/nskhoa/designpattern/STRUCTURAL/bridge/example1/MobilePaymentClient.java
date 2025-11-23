package com.nskhoa.designpattern.STRUCTURAL.bridge.example1;

// Refined Abstraction
public class MobilePaymentClient extends PaymentClient {
    public MobilePaymentClient(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    public void makePayment(double amount) {
        System.out.print("Mobile UI: ");
        paymentMethod.pay(amount);
    }
}
