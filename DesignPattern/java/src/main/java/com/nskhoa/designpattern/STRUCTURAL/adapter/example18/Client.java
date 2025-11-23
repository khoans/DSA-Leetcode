package com.nskhoa.designpattern.STRUCTURAL.adapter.example18;

public class Client {
    private VideoService videoService;

    public Client(VideoService videoService) {
        this.videoService = videoService;
    }

    public void playVideo(String videoId) {
        videoService.play(videoId);
    }

    public static void main(String[] args) {
        VideoService ytAdapter = new YouTubeAdapter();
        Client ytClient = new Client(ytAdapter);
        ytClient.playVideo("yt123");

        VideoService vimeoAdapter = new VimeoAdapter();
        Client vimeoClient = new Client(vimeoAdapter);
        vimeoClient.playVideo("vimeo456");
    }
}
