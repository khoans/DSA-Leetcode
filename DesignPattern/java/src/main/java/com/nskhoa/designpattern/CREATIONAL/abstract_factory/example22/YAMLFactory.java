package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example22;

public class YAMLFactory implements SerializationAbstractFactory {
    public Serializer createSerializer() {
        return new YAMLSerializer();
    }

    public Deserializer createDeserializer() {
        return new YAMLDeserializer();
    }
}
