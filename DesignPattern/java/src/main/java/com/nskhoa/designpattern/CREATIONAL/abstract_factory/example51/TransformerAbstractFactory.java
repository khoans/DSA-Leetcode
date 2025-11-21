package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example51;

public interface TransformerAbstractFactory {
    Transformer createTransformer();

    Serializer createSerializer();
}
