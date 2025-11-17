package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example17;

public class PayPalProcessor implements Processor {
    public void process(double amount) {
        System.out.println("PayPal Processed: " + amount);
    }
}
