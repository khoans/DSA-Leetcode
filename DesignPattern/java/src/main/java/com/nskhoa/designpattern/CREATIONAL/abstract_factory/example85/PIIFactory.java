package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example85;

public class PIIFactory implements DataMaskingAbstractFactory {
    public Masker createMasker() {
        return new PIIMasker();
    }

    public Validator createValidator() {
        return new PIIValidator();
    }
}

