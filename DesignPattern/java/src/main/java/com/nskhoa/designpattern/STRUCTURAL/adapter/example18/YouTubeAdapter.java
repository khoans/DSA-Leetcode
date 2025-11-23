package com.nskhoa.designpattern.STRUCTURAL.adapter.example18;

public class YouTubeAdapter implements VideoService {
    private YouTubeService yt = new YouTubeService();
    public void play(String videoId) {
        yt.playYouTubeVideo(videoId);
    }
}
