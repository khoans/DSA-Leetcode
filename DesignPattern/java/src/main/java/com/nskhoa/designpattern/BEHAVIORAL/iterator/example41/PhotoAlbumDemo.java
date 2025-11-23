package com.nskhoa.designpattern.BEHAVIORAL.iterator.example41;

public class PhotoAlbumDemo {
    public static void main(String[] args) {
        PhotoAlbum album = new PhotoAlbum();
        album.addPhoto(new Photo("beach.png"));
        album.addPhoto(new Photo("mountains.jpg"));

        MyIterator<Photo> it = album.createIterator();
        while (it.hasNext()) {
            System.out.println(it
                                       .next()
                                       .getFilename());
        }
    }
}

