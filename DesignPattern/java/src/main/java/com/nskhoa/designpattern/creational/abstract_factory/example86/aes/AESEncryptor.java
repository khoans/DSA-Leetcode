package com.nskhoa.designpattern.creational.abstract_factory.example86.aes;

import com.nskhoa.designpattern.creational.abstract_factory.example86.Encryptor;

public class AESEncryptor implements Encryptor {
    public String encrypt(String data) {
        return "AES Encrypted: " + data;
    }
}
