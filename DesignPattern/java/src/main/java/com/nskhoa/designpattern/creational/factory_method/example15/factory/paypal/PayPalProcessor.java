package com.nskhoa.designpattern.creational.factory_method.example15.factory.paypal;

import com.nskhoa.designpattern.creational.factory_method.example15.factory.PaymentProcessor;

public class PayPalProcessor implements PaymentProcessor {
    public void process(double amount) {
        System.out.println("Processed PayPal: " + amount);
    }
}
