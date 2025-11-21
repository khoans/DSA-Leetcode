package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example50;

public class AESEncryptor implements Encryptor {
    public String encrypt(String data) {
        return "AES Encrypted: " + data;
    }
}
