package com.nskhoa.designpattern.creational.factory_method.example20.factory.json;

import com.nskhoa.designpattern.creational.factory_method.example20.factory.SerializerFactory;
import com.nskhoa.designpattern.creational.factory_method.example20.factory.Serializer;

public class JSONFactory extends SerializerFactory {
    public Serializer createSerializer() {
        return new JSONSerializer();
    }
}
