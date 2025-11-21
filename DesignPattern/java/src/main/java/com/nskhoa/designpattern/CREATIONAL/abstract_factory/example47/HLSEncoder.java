package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example47;

public class HLSEncoder implements Encoder {
    public void encode(String video) {
        System.out.println("HLS Encoded: " + video);
    }
}
