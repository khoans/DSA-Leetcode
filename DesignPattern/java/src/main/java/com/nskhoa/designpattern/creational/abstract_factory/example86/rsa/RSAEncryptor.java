package com.nskhoa.designpattern.creational.abstract_factory.example86.rsa;

import com.nskhoa.designpattern.creational.abstract_factory.example86.Encryptor;

public class RSAEncryptor implements Encryptor {
    public String encrypt(String data) {
        return "RSA Encrypted: " + data;
    }
}
