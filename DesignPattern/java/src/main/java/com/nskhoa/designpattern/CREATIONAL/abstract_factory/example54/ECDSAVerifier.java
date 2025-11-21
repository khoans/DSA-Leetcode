package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example54;

public class ECDSAVerifier implements Verifier {
    public boolean verify(byte[] sig, String data) {
        return true;
    }
}
