package com.nskhoa.designpattern.STRUCTURAL.bridge.example7;

public class MP3Player extends AudioPlayer {
    MP3Player(AudioDevice device) {
        super(device);
    }

    public void play(String audio) {
        device.outputSound(audio);
    }
}
