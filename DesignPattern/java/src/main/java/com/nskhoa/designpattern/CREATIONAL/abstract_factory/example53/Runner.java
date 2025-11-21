package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example53;

// Usage: HashAbstractFactory factory = new SHAFactory(); Hasher hasher = factory.createHasher(); String digest = hasher.hash("password");

public class Runner {
    public static void main(String[] args) {
        HashAbstractFactory factory = new SHAFactory();
        Hasher hasher = factory.createHasher();
        Verifier verifier = factory.createVerifier();

        String data = "my_secure_data";
        String hashedData = hasher.hash(data);
        System.out.println(hashedData);

        boolean isValid = verifier.verify(hashedData, data);
        System.out.println("Is valid: " + isValid);
    }
}
