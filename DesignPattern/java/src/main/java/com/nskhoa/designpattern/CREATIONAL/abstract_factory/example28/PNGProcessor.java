package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example28;

public class PNGProcessor implements Processor {
    public void process(String data) {
        System.out.println("PNG Processed: " + data);
    }
}
