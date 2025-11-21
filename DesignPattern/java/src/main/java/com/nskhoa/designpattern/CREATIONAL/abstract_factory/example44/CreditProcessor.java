package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example44;

public class CreditProcessor implements Processor {
    public void process(double amount) {
        System.out.println("Credit Processed: " + amount);
    }
}
