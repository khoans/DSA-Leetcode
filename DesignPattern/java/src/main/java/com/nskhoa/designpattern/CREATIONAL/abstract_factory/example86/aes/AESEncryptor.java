package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example86.aes;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example86.Encryptor;

public class AESEncryptor implements Encryptor {
    public String encrypt(String data) {
        return "AES Encrypted: " + data;
    }
}
