package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example37;

public class NumericFactory implements ValidationAbstractFactory {
    public Validator createValidator() {
        return new NumericValidator();
    }

    public Sanitizer createSanitizer() {
        return new NumericSanitizer();
    }
}
