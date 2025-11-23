package com.nskhoa.designpattern.BEHAVIORAL.iterator.example4;

public class FileSystem {
    private final MyFile[] files = new MyFile[10];
    private int count = 0;

    void addFile(MyFile f) { if (count < files.length) files[count++] = f; }

    MyIterator<MyFile> createIterator() { return new FileSystemIterator(); }

    private class FileSystemIterator implements MyIterator<MyFile> {
        private int index = 0;
        public boolean hasNext() { return index < count; }
        public MyFile next() { return files[index++]; }
    }
}
