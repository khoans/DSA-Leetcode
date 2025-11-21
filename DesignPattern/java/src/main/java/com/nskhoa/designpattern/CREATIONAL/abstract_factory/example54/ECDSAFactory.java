package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example54;

public class ECDSAFactory implements SignatureAbstractFactory {
    public Signer createSigner() {
        return new ECDSASigner();
    }

    public Verifier createVerifier() {
        return new ECDSAVerifier();
    }
}
