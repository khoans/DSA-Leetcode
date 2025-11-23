package com.nskhoa.designpattern.STRUCTURAL.bridge.example12;

public class BridgePatternExample {
    public static void main(String[] args) {
        MediaPlayerClient mobileMp3Player = new MobileMediaPlayerClient(new MP3Format());
        mobileMp3Player.play("song.mp3");

        MediaPlayerClient desktopMp4Player = new DesktopMediaPlayerClient(new MP4Format());
        desktopMp4Player.play("video.mp4");
    }
}
