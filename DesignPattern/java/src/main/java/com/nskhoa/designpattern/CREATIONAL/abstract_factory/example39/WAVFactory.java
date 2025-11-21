package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example39;

public class WAVFactory implements AudioAbstractFactory {
    public Encoder createEncoder() {
        return new WAVEncoder();
    }

    public Decoder createDecoder() {
        return new WAVDecoder();
    }
}
