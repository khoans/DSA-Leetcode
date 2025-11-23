package com.nskhoa.designpattern.BEHAVIORAL.iterator.example42;

public class VideoPlaylistDemo {
    public static void main(String[] args) {
        VideoPlaylist playlist = new VideoPlaylist();
        playlist.addVideo(new Video("Funny Cats"));
        playlist.addVideo(new Video("Top 10 Tricks"));

        MyIterator<Video> it = playlist.createIterator();
        while (it.hasNext()) {
            System.out.println(it
                                       .next()
                                       .getTitle());
        }
    }
}

