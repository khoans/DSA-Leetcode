package com.nskhoa.designpattern.BEHAVIORAL.iterator.example8;

public class Directory {
    private final Folder[] folders = new Folder[10];
    private int count = 0;

    void addFolder(Folder folder) {
        if (count < folders.length) {
            folders[count++] = folder;
        }
    }

    MyIterator<Folder> createIterator() {
        return new DirectoryIterator();
    }

    private class DirectoryIterator implements MyIterator<Folder> {
        private int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Folder next() {
            return folders[index++];
        }
    }
}
