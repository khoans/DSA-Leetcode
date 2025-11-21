package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example37;

public interface ValidationAbstractFactory {
    Validator createValidator();

    Sanitizer createSanitizer();
}
