package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example50;

public class RSAFactory implements EncryptionAbstractFactory {
    public Encryptor createEncryptor() {
        return new RSAEncryptor();
    }

    public Decryptor createDecryptor() {
        return new RSADecryptor();
    }
}
