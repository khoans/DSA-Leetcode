package com.nskhoa.designpattern.CREATIONAL.factory_method.example15.factory.paypal;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example15.factory.PaymentProcessor;

public class PayPalProcessor implements PaymentProcessor {
    public void process(double amount) {
        System.out.println("Processed PayPal: " + amount);
    }
}
