package com.nskhoa.designpattern.BEHAVIORAL.iterator.example5;

public class Playlist {
    private final Song[] songs = new Song[10];
    private int count = 0;

    void addSong(Song song) {
        if (count < songs.length) {
            songs[count++] = song;
        }
    }

    MyIterator<Song> createIterator() {
        return new PlaylistIterator();
    }

    private class PlaylistIterator implements MyIterator<Song> {
        private int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Song next() {
            return songs[index++];
        }
    }
}
