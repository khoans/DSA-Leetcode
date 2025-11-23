package com.nskhoa.designpattern.STRUCTURAL.bridge.example12;

public class MobileMediaPlayerClient extends MediaPlayerClient {
    public MobileMediaPlayerClient(MediaFormat mediaFormat) { super(mediaFormat); }
    public void play(String filename) {
        System.out.print("Mobile Player: ");
        mediaFormat.playFile(filename);
    }
}
