package com.nskhoa.designpattern.BEHAVIORAL.iterator.example29;

public class MusicAlbum {
    private final Track[] tracks = new Track[10];
    private int count = 0;

    void addTrack(Track track) {
        if (count < tracks.length) {
            tracks[count++] = track;
        }
    }

    MyIterator<Track> createIterator() {
        return new TrackIterator();
    }

    private class TrackIterator implements MyIterator<Track> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Track next() {
            return tracks[index++];
        }
    }
}
