package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example47;

public interface StreamingAbstractFactory {
    Encoder createEncoder();

    Player createPlayer();
}
