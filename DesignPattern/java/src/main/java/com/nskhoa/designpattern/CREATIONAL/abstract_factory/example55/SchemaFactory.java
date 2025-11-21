package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example55;

public class SchemaFactory implements DocumentBuilderAbstractFactory {
    public Builder createBuilder() {
        return new SchemaBuilder();
    }

    public Validator createValidator() {
        return new SchemaValidator();
    }
}
