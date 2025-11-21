package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example53;

public class SHAFactory implements HashAbstractFactory {
    public Hasher createHasher() {
        return new SHAHasher();
    }

    public Verifier createVerifier() {
        return new SHAVerifier();
    }
}
