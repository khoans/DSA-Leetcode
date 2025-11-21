package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example55;

public class StandardBuilder implements Builder {
    public Document build(String xml) {
        return new Document("Standard");
    }
}
