package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example47;

public class DASHEncoder implements Encoder {
    public void encode(String video) {
        System.out.println("DASH Encoded: " + video);
    }
}
