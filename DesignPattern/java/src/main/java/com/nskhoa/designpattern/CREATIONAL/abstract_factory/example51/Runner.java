package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example51;

// Usage: TransformerAbstractFactory factory = new XSLTFactory(); Transformer trans = factory.createTransformer(); String result = trans.transform("xml");

public class Runner {
    public static void main(String[] args) {
        TransformerAbstractFactory factory = new XSLTFactory();
        Transformer transformer = factory.createTransformer();
        Serializer serializer = factory.createSerializer();

        String result = transformer.transform("<xml></xml>");
        serializer.serialize(result);
    }
}
