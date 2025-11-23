package com.nskhoa.designpattern.BEHAVIORAL.iterator.example43;

public class PodcastDemo {
    public static void main(String[] args) {
        Podcast podcast = new Podcast();
        podcast.addEpisode(new Episode("Introduction"));
        podcast.addEpisode(new Episode("Deep Dive"));

        MyIterator<Episode> it = podcast.createIterator();
        while (it.hasNext()) {
            System.out.println(it
                                       .next()
                                       .getTitle());
        }
    }
}

