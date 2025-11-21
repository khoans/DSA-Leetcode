package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example50;

// Usage: EncryptionAbstractFactory factory = new AESFactory(); Encryptor enc = factory.createEncryptor(); String result = enc.encrypt("secret");

public class Runner {
    public static void main(String[] args) {
        EncryptionAbstractFactory factory = new AESFactory();
        Encryptor encryptor = factory.createEncryptor();
        Decryptor decryptor = factory.createDecryptor();

        String data = "Hello World";
        String encryptedData = encryptor.encrypt(data);
        System.out.println(encryptedData);

        String decryptedData = decryptor.decrypt(encryptedData);
        System.out.println(decryptedData);
    }
}
