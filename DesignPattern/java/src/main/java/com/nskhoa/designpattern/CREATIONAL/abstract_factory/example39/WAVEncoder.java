package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example39;

public class WAVEncoder implements Encoder {
    public void encode(String audio) {
        System.out.println("WAV Encoded: " + audio);
    }
}
