package com.nskhoa.designpattern.STRUCTURAL.bridge.example7;

public class WAVPlayer extends AudioPlayer {
    WAVPlayer(AudioDevice device) {
        super(device);
    }

    public void play(String audio) {
        device.outputSound(audio);
    }
}
