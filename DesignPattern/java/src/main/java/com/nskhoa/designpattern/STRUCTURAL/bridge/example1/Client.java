package com.nskhoa.designpattern.STRUCTURAL.bridge.example1;

public class Client {
    public static void main(String[] args) {
        PaymentClient mobilePayment = new MobilePaymentClient(new CreditCard());
        mobilePayment.makePayment(100.0);

        PaymentClient webPayment = new WebPaymentClient(new PayPal());
        webPayment.makePayment(200.0);
    }
}
