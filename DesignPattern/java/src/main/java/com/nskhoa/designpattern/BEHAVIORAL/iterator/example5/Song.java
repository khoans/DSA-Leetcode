package com.nskhoa.designpattern.BEHAVIORAL.iterator.example5;

public class Song {
    private final String title;
    private final String artist;

    Song(String title, String artist) {
        this.title = title; this.artist = artist;
    }

    String getTitle() {
        return title;
    }

    String getArtist() {
        return artist;
    }
}
