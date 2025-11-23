package com.nskhoa.designpattern.BEHAVIORAL.iterator.example42;

public class VideoPlaylist {
    private final Video[] videos = new Video[10];
    private int count = 0;

    void addVideo(Video video) {
        if (count < videos.length) {
            videos[count++] = video;
        }
    }

    MyIterator<Video> createIterator() {
        return new VideoIterator();
    }

    private class VideoIterator implements MyIterator<Video> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Video next() {
            return videos[index++];
        }
    }
}
