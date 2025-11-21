package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example51;

public class FOSerializer implements Serializer {
    public void serialize(String output) {
        System.out.println("FO Serialized: " + output);
    }
}
