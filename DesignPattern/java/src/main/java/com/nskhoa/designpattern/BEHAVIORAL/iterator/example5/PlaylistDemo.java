package com.nskhoa.designpattern.BEHAVIORAL.iterator.example5;

public class PlaylistDemo {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Let it Be", "The Beatles"));
        playlist.addSong(new Song("Imagine", "John Lennon"));

        MyIterator<Song> it = playlist.createIterator();
        while (it.hasNext()) {
            Song song = it.next();
            System.out.println(song.getTitle() + " - " + song.getArtist());
        }
    }
}

