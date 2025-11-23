package com.nskhoa.designpattern.BEHAVIORAL.iterator.example4;

public class FileSystemDemo {
    public static void main(String[] args) {
        FileSystem fs = new FileSystem();
        fs.addFile(new MyFile("Document.txt"));
        fs.addFile(new MyFile("Photo.jpg"));

        MyIterator<MyFile> iter = fs.createIterator();
        while (iter.hasNext()) {
            MyFile file = iter.next();
            System.out.println("File: " + file.getName());
        }
    }
}

