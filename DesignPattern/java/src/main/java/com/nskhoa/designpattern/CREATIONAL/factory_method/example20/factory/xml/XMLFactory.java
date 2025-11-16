package com.nskhoa.designpattern.CREATIONAL.factory_method.example20.factory.xml;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example20.factory.Serializer;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example20.factory.SerializerFactory;

public class XMLFactory extends SerializerFactory {
    public Serializer createSerializer() {
        return new XMLSerializer();
    }
}
