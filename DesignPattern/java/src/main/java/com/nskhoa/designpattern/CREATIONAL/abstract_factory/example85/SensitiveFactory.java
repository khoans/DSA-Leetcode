package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example85;

public class SensitiveFactory implements DataMaskingAbstractFactory {
    public Masker createMasker() {
        return new SensitiveMasker();
    }

    public Validator createValidator() {
        return new SensitiveValidator();
    }
}
