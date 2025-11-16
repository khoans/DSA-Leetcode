package com.nskhoa.designpattern.creational.abstract_factory.example86;

public interface DataEncryptionAbstractFactory {
    Encryptor createEncryptor();

    KeyGenerator createKeyGenerator();
}
