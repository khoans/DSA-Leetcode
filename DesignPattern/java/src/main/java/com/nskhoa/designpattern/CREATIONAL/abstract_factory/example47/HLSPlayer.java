package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example47;

public class HLSPlayer implements Player {
    public void play(String stream) {
        System.out.println("HLS Playing: " + stream);
    }
}
