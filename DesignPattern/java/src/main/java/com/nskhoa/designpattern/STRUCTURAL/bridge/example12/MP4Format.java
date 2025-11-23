package com.nskhoa.designpattern.STRUCTURAL.bridge.example12;

public class MP4Format implements MediaFormat {
    public void playFile(String filename) {
        System.out.println("Playing MP4 file: " + filename);
    }
}
