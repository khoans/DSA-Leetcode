package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example85;

public class SensitiveMasker implements Masker {
    public String mask(String data) {
        return data.replaceAll(".", "*");
    }
}
