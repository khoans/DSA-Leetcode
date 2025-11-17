package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example14;

public class SAXParser implements Parser {
    public void parse(String xml) {
        System.out.println("SAX Parsed: " + xml);
    }
}
