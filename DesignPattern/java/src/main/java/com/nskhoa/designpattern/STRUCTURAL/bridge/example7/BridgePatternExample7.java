package com.nskhoa.designpattern.STRUCTURAL.bridge.example7;

public class BridgePatternExample7 {
    public static void main(String[] args) {
        AudioDevice speakers = new Speakers();
        AudioDevice headphones = new Headphones();

        AudioPlayer mp3PlayerWithSpeakers = new MP3Player(speakers);
        AudioPlayer wavPlayerWithHeadphones = new WAVPlayer(headphones);

        mp3PlayerWithSpeakers.play("song.mp3");
        wavPlayerWithHeadphones.play("track.wav");
    }
}
