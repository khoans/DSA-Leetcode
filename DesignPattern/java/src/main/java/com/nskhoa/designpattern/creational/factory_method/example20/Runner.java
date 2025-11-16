package com.nskhoa.designpattern.creational.factory_method.example20;

import com.nskhoa.designpattern.creational.factory_method.example20.factory.json.JSONFactory;
import com.nskhoa.designpattern.creational.factory_method.example20.factory.SerializerFactory;
import com.nskhoa.designpattern.creational.factory_method.example20.factory.xml.XMLFactory;
import com.nskhoa.designpattern.creational.factory_method.example20.factory.Serializer;

public class Runner {
    public static void main(String[] args) {
        // Usage:
        SerializerFactory factory = new JSONFactory(); Serializer ser = factory.createSerializer();
        String result = ser.serialize(new Object());
        System.out.println(result);

        SerializerFactory xmlFactory = new XMLFactory();
        Serializer xmlSer = xmlFactory.createSerializer();
        String xmlResult = xmlSer.serialize(new Object());
        System.out.println(xmlResult);

    }
}
