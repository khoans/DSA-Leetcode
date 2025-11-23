package com.nskhoa.designpattern.STRUCTURAL.bridge.example12;

public class MP3Format implements MediaFormat {
    public void playFile(String filename) {
        System.out.println("Playing MP3 file: " + filename);
    }
}
