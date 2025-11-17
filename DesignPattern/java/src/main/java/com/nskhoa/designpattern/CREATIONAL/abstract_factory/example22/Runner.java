package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example22;

public class Runner {
    public static void main(String[] args) {
        SerializationAbstractFactory factory = new JSONFactory();
        Serializer serializer = factory.createSerializer();
        Deserializer deserializer = factory.createDeserializer();

        String serializedData = serializer.serialize("Example Data");
        System.out.println(serializedData);

        Object deserializedData = deserializer.deserialize(serializedData);
        System.out.println("Deserialized Data: " + deserializedData);
    }
}
