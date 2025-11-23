package com.nskhoa.designpattern.STRUCTURAL.bridge.example7;

public class Speakers implements AudioDevice {
    public void outputSound(String audio) {
        System.out.println("Speakers playing: " + audio);
    }
}
