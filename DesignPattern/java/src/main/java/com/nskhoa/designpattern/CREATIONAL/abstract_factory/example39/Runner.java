package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example39;

// Usage: AudioAbstractFactory factory = new MP3Factory(); Encoder enc = factory.createEncoder(); enc.encode("song.wav");
public class Runner {
    public static void main(String[] args) {
        AudioAbstractFactory factory = new MP3Factory();
        Encoder encoder = factory.createEncoder();
        Decoder decoder = factory.createDecoder();

        encoder.encode("song.wav");
        System.out.println(decoder.decode("song.mp3"));
    }
}
