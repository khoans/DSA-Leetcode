package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example51;

public class XSLTFactory implements TransformerAbstractFactory {
    public Transformer createTransformer() {
        return new XSLTTransformer();
    }

    public Serializer createSerializer() {
        return new XSLTSerializer();
    }
}
