package com.nskhoa.designpattern.creational.abstract_factory.example86.aes;

import com.nskhoa.designpattern.creational.abstract_factory.example86.DataEncryptionAbstractFactory;
import com.nskhoa.designpattern.creational.abstract_factory.example86.Encryptor;
import com.nskhoa.designpattern.creational.abstract_factory.example86.KeyGenerator;

public class AESFactory implements DataEncryptionAbstractFactory {
    public Encryptor createEncryptor() {
        return new AESEncryptor();
    }

    public KeyGenerator createKeyGenerator() {
        return new AESKeyGenerator();
    }
}

