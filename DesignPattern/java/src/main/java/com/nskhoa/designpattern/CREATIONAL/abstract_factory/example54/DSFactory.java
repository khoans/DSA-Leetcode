package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example54;

public class DSFactory implements SignatureAbstractFactory {
    public Signer createSigner() {
        return new DSSigner();
    }

    public Verifier createVerifier() {
        return new DSVerifier();
    }
}
