package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example39;

public class MP3Factory implements AudioAbstractFactory {
    public Encoder createEncoder() {
        return new MP3Encoder();
    }

    public Decoder createDecoder() {
        return new MP3Decoder();
    }
}
