package com.nskhoa.designpattern.creational.factory_method.example20.factory.json;

import com.nskhoa.designpattern.creational.factory_method.example20.factory.Serializer;

public class JSONSerializer implements Serializer {
    public String serialize(Object obj) {
        return "JSON: " + obj.toString();
    }
}

