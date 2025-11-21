package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example55;

public interface DocumentBuilderAbstractFactory {
    Builder createBuilder();

    Validator createValidator();
}
