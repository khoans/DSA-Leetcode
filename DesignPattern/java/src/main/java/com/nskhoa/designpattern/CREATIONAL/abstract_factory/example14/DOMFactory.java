package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example14;

public class DOMFactory implements XMLAbstractFactory {
    public Parser createParser() {
        return new DOMParser();
    }

    public Validator createValidator() {
        return new DOMValidator();
    }
}
