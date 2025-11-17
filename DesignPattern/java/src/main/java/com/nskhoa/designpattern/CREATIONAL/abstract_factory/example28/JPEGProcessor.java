package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example28;

public class JPEGProcessor implements Processor {
    public void process(String data) {
        System.out.println("JPEG Processed: " + data);
    }
}
