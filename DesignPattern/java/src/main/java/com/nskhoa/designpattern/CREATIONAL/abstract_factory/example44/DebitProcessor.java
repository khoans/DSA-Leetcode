package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example44;

public class DebitProcessor implements Processor {
    public void process(double amount) {
        System.out.println("Debit Processed: " + amount);
    }
}
