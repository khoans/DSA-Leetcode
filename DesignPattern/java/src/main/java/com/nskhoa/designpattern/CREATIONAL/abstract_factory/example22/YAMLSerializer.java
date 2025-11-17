package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example22;

public class YAMLSerializer implements Serializer {
    public String serialize(Object obj) {
        return "YAML: " + obj.toString();
    }
}
