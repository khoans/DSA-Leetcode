package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example14;

public interface XMLAbstractFactory {
    Parser createParser();

    Validator createValidator();
}

