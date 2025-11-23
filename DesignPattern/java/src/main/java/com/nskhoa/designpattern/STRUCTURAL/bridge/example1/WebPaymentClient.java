package com.nskhoa.designpattern.STRUCTURAL.bridge.example1;

public class WebPaymentClient extends PaymentClient {
    public WebPaymentClient(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    public void makePayment(double amount) {
        System.out.print("Web UI: ");
        paymentMethod.pay(amount);
    }
}
