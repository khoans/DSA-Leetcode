package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example22;

public class JSONFactory implements SerializationAbstractFactory {
    public Serializer createSerializer() {
        return new JSONSerializer();
    }

    public Deserializer createDeserializer() {
        return new JSONDeserializer();
    }
}
