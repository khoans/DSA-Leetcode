package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example51;

public class FOFactory implements TransformerAbstractFactory {
    public Transformer createTransformer() {
        return new FOTransformer();
    }

    public Serializer createSerializer() {
        return new FOSerializer();
    }
}
