package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example86.rsa;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example86.KeyGenerator;

public class RSAKeyGenerator implements KeyGenerator {
    public String generateKey() {
        return "RSA Key 2048";
    }
}
