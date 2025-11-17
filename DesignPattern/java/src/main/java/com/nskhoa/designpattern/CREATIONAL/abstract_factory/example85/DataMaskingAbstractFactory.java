package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example85;

public interface DataMaskingAbstractFactory {
    Masker createMasker();

    Validator createValidator();
}
