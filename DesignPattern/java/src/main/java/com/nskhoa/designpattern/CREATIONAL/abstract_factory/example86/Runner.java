package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example86;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example86.aes.AESFactory;

public class Runner {
    public static void main(String[] args) {
        // Usage: DataEncryptionAbstractFactory factory = new AESFactory(); Encryptor enc = factory.createEncryptor(); String ciphertext = enc.encrypt("sensitive data");

        DataEncryptionAbstractFactory factory = new AESFactory();
        Encryptor encryptor = factory.createEncryptor();
        String ciphertext = encryptor.encrypt("sensitive data");
        System.out.println(ciphertext);
        KeyGenerator keyGenerator = factory.createKeyGenerator();
        String key = keyGenerator.generateKey();
        System.out.println(key);
    }
}
