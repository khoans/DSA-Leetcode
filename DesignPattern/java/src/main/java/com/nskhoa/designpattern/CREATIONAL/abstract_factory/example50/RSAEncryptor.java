package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example50;

public class RSAEncryptor implements Encryptor {
    public String encrypt(String data) {
        return "RSA Encrypted: " + data;
    }
}
