package com.nskhoa.designpattern.STRUCTURAL.adapter.example4;

public class MediaPlayerAdapter implements MediaPlayer {
    private Mp3Player mp3Player = new Mp3Player();
    private Mp4Player mp4Player = new Mp4Player();

    public void play(String fileType, String fileName) {
        if ("mp3".equalsIgnoreCase(fileType)) {
            mp3Player.playMp3(fileName);
        }
        else if ("mp4".equalsIgnoreCase(fileType)) {
            mp4Player.playMp4(fileName);
        }
        else {
            System.out.println("Unsupported media format");
        }
    }
}
