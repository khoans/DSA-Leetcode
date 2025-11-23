package com.nskhoa.designpattern.BEHAVIORAL.iterator.example43;

public class Podcast {
    private final Episode[] episodes = new Episode[10];
    private int count = 0;

    void addEpisode(Episode episode) {
        if (count < episodes.length) {
            episodes[count++] = episode;
        }
    }

    MyIterator<Episode> createIterator() {
        return new EpisodeIterator();
    }

    private class EpisodeIterator implements MyIterator<Episode> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Episode next() {
            return episodes[index++];
        }
    }
}
