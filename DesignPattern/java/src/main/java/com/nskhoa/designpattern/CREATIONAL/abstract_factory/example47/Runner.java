package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example47;

// Usage: StreamingAbstractFactory factory = new HLSFactory(); Encoder enc = factory.createEncoder(); enc.encode("video.mp4");
public class Runner {
    public static void main(String[] args) {
        StreamingAbstractFactory factory = new HLSFactory();
        Encoder encoder = factory.createEncoder();
        Player player = factory.createPlayer();

        encoder.encode("video.mp4");
        player.play("stream.m3u8");
    }
}
