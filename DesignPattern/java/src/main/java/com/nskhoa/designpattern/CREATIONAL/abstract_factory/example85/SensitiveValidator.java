package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example85;

public class SensitiveValidator implements Validator {
    public boolean isMasked(String data) {
        return data.matches("\\*+");
    }
}
