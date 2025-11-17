package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example67;

public class StreamingProcessor implements Processor {
    public void process(String data) {
        System.out.println("Streaming Processed: " + data);
    }
}
