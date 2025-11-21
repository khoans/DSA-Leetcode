package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example35;

// Usage: DocumentAbstractFactory factory = new ReportFactory(); Generator gen = factory.createGenerator(); String doc = gen.generate("data");
public class Runner {
    public static void main(String[] args) {
        DocumentAbstractFactory factory = new ReportFactory();
        Generator generator = factory.createGenerator();
        Formatter formatter = factory.createFormatter();

        String document = generator.generate("data");
        formatter.format(document);
    }
}
