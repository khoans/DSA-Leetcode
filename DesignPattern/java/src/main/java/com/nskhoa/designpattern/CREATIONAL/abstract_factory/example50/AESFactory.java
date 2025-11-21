package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example50;

public class AESFactory implements EncryptionAbstractFactory {
    public Encryptor createEncryptor() {
        return new AESEncryptor();
    }

    public Decryptor createDecryptor() {
        return new AESDecryptor();
    }
}
