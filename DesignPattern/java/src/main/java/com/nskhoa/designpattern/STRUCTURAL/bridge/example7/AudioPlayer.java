package com.nskhoa.designpattern.STRUCTURAL.bridge.example7;

public abstract class AudioPlayer {
    protected AudioDevice device;

    AudioPlayer(AudioDevice device) {
        this.device = device;
    }

    abstract void play(String audio);
}
