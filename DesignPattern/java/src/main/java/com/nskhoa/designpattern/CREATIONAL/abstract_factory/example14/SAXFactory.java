package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example14;

public class SAXFactory implements XMLAbstractFactory {
    public Parser createParser() {
        return new SAXParser();
    }

    public Validator createValidator() {
        return new SAXValidator();
    }
}
