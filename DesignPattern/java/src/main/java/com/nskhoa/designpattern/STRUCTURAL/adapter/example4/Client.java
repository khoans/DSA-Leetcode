package com.nskhoa.designpattern.STRUCTURAL.adapter.example4;

public class Client {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayerAdapter();
        mediaPlayer.play("mp3", "song.mp3");
        mediaPlayer.play("mp4", "video.mp4");
        mediaPlayer.play("avi", "movie.avi");
    }
}
