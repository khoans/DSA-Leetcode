package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example47;

public class DASHFactory implements StreamingAbstractFactory {
    public Encoder createEncoder() {
        return new DASHEncoder();
    }

    public Player createPlayer() {
        return new DASHPlayer();
    }
}
