package com.nskhoa.designpattern.BEHAVIORAL.iterator.example29;

public class MusicAlbumDemo {
    public static void main(String[] args) {
        MusicAlbum album = new MusicAlbum();
        album.addTrack(new Track("Song One", 210));
        album.addTrack(new Track("Song Two", 180));

        MyIterator<Track> it = album.createIterator();
        while (it.hasNext()) {
            Track t = it.next();
            System.out.println(t.getTitle() + " (" + t.getLength() + "s)");
        }
    }
}

