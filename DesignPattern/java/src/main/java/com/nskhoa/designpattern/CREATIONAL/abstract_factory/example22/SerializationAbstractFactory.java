package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example22;

public interface SerializationAbstractFactory {
    Serializer createSerializer();

    Deserializer createDeserializer();
}

// Usage: SerializationAbstractFactory factory = new JSONFactory(); Serializer ser = factory.createSerializer(); String result = ser.serialize(new Object());

