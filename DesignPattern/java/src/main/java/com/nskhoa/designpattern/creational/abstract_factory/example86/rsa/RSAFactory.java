package com.nskhoa.designpattern.creational.abstract_factory.example86.rsa;

import com.nskhoa.designpattern.creational.abstract_factory.example86.DataEncryptionAbstractFactory;
import com.nskhoa.designpattern.creational.abstract_factory.example86.Encryptor;
import com.nskhoa.designpattern.creational.abstract_factory.example86.KeyGenerator;

public class RSAFactory implements DataEncryptionAbstractFactory {
    public Encryptor createEncryptor() {
        return new RSAEncryptor();
    }

    public KeyGenerator createKeyGenerator() {
        return new RSAKeyGenerator();
    }
}
