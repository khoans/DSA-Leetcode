package com.nskhoa.designpattern.CREATIONAL.factory_method.example15.factory.creditcard;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example15.factory.PaymentProcessor;

public class CreditCardProcessor implements PaymentProcessor {
    public void process(double amount) {
        System.out.println("Processed Credit Card: " + amount);
    }
}
