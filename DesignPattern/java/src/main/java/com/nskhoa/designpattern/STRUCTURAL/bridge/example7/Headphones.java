package com.nskhoa.designpattern.STRUCTURAL.bridge.example7;

public class Headphones implements AudioDevice {
    public void outputSound(String audio) {
        System.out.println("Headphones playing: " + audio);
    }
}
