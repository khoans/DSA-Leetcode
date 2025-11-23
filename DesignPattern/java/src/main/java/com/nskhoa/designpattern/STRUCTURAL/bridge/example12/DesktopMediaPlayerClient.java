package com.nskhoa.designpattern.STRUCTURAL.bridge.example12;

public class DesktopMediaPlayerClient extends MediaPlayerClient {
    public DesktopMediaPlayerClient(MediaFormat mediaFormat) { super(mediaFormat); }
    public void play(String filename) {
        System.out.print("Desktop Player: ");
        mediaFormat.playFile(filename);
    }
}
