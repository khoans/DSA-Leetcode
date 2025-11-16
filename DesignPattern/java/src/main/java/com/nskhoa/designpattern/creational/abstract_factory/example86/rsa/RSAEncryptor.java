package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example86.rsa;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example86.Encryptor;

public class RSAEncryptor implements Encryptor {
    public String encrypt(String data) {
        return "RSA Encrypted: " + data;
    }
}
