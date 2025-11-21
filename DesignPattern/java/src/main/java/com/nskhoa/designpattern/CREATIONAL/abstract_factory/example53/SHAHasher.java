package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example53;

public class SHAHasher implements Hasher {
    public String hash(String input) {
        return "SHA Hashed: " + input;
    }
}
