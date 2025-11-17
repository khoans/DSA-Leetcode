package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example28;

public class Runner {
    public static void main(String[] args) {
        ImageAbstractFactory factory = new JPEGFactory();
        Filter filter = factory.createFilter();
        Processor processor = factory.createProcessor();

        filter.apply("photo.jpg");
        processor.process("photo data");
    }
}
