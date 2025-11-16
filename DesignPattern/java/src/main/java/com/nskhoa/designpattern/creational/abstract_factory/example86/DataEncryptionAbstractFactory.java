package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example86;

public interface DataEncryptionAbstractFactory {
    Encryptor createEncryptor();

    KeyGenerator createKeyGenerator();
}
