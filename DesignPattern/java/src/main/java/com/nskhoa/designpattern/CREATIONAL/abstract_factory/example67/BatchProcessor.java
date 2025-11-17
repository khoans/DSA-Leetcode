package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example67;

public class BatchProcessor implements Processor {
    public void process(String data) {
        System.out.println("Batch Processed: " + data);
    }
}
