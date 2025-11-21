package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example53;

public class MD5Factory implements HashAbstractFactory {
    public Hasher createHasher() {
        return new MD5Hasher();
    }

    public Verifier createVerifier() {
        return new MD5Verifier();
    }
}
