package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example47;

public class HLSFactory implements StreamingAbstractFactory {
    public Encoder createEncoder() {
        return new HLSEncoder();
    }

    public Player createPlayer() {
        return new HLSPlayer();
    }
}
