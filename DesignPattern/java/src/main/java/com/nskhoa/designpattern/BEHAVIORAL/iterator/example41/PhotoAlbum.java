package com.nskhoa.designpattern.BEHAVIORAL.iterator.example41;

public class PhotoAlbum {
    private final Photo[] photos = new Photo[10];
    private int count = 0;

    void addPhoto(Photo photo) {
        if (count < photos.length) {
            photos[count++] = photo;
        }
    }

    MyIterator<Photo> createIterator() {
        return new PhotoIterator();
    }

    private class PhotoIterator implements MyIterator<Photo> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Photo next() {
            return photos[index++];
        }
    }
}
