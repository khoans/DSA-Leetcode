package com.nskhoa.designpattern.STRUCTURAL.adapter.example18;

public class VimeoAdapter implements VideoService {
    private VimeoService vimeo = new VimeoService();
    public void play(String videoId) {
        vimeo.playVimeoVideo(videoId);
    }
}
