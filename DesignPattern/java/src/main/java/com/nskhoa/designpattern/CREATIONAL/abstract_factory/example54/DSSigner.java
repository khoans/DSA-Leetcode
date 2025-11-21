package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example54;

public class DSSigner implements Signer {
    public byte[] sign(String data) {
        return "DS Signed".getBytes();
    }
}
