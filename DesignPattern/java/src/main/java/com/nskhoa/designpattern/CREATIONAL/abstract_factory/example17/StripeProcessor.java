package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example17;

public class StripeProcessor implements Processor {
    public void process(double amount) {
        System.out.println("Stripe Processed: " + amount);
    }
}
