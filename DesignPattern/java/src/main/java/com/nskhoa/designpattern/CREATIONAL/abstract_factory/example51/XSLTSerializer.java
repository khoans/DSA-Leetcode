package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example51;

public class XSLTSerializer implements Serializer {
    public void serialize(String output) {
        System.out.println("XSLT Serialized: " + output);
    }
}
