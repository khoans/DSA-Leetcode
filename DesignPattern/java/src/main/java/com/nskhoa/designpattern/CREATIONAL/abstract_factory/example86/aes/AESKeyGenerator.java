package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example86.aes;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example86.KeyGenerator;

public class AESKeyGenerator implements KeyGenerator {
    public String generateKey() {
        return "AES Key 256";
    }
}
