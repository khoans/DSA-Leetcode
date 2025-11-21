package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example53;

public interface HashAbstractFactory {
    Hasher createHasher();

    Verifier createVerifier();
}
