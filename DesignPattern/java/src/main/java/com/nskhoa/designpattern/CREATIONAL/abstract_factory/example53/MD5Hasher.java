package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example53;

public class MD5Hasher implements Hasher {
    public String hash(String input) {
        return "MD5 Hashed: " + input;
    }
}
