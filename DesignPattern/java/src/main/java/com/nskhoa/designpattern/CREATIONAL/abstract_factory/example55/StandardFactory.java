package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example55;

public class StandardFactory implements DocumentBuilderAbstractFactory {
    public Builder createBuilder() {
        return new StandardBuilder();
    }

    public Validator createValidator() {
        return new StandardValidator();
    }
}
