package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example39;

public class MP3Encoder implements Encoder {
    public void encode(String audio) {
        System.out.println("MP3 Encoded: " + audio);
    }
}
