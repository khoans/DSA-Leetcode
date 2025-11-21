package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example50;

public interface EncryptionAbstractFactory {
    Encryptor createEncryptor();

    Decryptor createDecryptor();
}
