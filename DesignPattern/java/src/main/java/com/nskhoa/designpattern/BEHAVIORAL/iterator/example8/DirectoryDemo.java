package com.nskhoa.designpattern.BEHAVIORAL.iterator.example8;

public class DirectoryDemo {
    public static void main(String[] args) {
        Directory dir = new Directory();
        dir.addFolder(new Folder("Documents"));
        dir.addFolder(new Folder("Pictures"));

        MyIterator<Folder> it = dir.createIterator();
        while (it.hasNext()) {
            Folder folder = it.next();
            System.out.println("Folder: " + folder.getName());
        }
    }
}
