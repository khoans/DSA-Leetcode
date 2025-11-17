package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example14;

// Usage: XMLAbstractFactory factory = new DOMFactory(); Parser parser = factory.createParser(); parser.parse("<doc/>");
public class Runner {
    public static void main(String[] args) {
        XMLAbstractFactory factory = new DOMFactory();
        Parser parser = factory.createParser();
        Validator validator = factory.createValidator();

        parser.parse("<doc/>");
        System.out.println("Validation: " + validator.validate("schema"));
    }
}
