package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example22;

public class JSONSerializer implements Serializer {
    public String serialize(Object obj) {
        return "JSON: " + obj.toString();
    }
}
