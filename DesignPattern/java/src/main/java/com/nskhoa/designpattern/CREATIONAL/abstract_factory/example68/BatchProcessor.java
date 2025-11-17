package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example68;

public class BatchProcessor implements Processor {
    public void process(String data) {
        System.out.println("Batch Processed: " + data);
    }
}
