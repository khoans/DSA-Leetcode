package com.nskhoa.designpattern.STRUCTURAL.adapter.example29;

public class Track {
    private final String title;
    private final int lengthInSeconds;

    Track(String title, int lengthInSeconds) {
        this.title = title;
        this.lengthInSeconds = lengthInSeconds;
    }

    String getTitle() {
        return title;
    }

    int getLength() {
        return lengthInSeconds;
    }
}
