package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example85;

public class PIIMasker implements Masker {
    public String mask(String data) {
        return "***" + data.substring(3);
    }
}
