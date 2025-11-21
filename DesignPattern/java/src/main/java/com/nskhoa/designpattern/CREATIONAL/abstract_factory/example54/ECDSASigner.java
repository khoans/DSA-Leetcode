package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example54;

public class ECDSASigner implements Signer {
    public byte[] sign(String data) {
        return "ECDSA Signed".getBytes();
    }
}
