package com.nskhoa.designpattern.STRUCTURAL.bridge.example12;

public abstract class MediaPlayerClient {
    protected MediaFormat mediaFormat;
    protected MediaPlayerClient(MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat;
    }
    abstract void play(String filename);
}
