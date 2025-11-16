package com.nskhoa.designpattern.creational.factory_method.example20.factory.xml;

import com.nskhoa.designpattern.creational.factory_method.example20.factory.Serializer;

public class XMLSerializer implements Serializer {
    public String serialize(Object obj) {
        return "XML: " + obj.toString();
    }
}
