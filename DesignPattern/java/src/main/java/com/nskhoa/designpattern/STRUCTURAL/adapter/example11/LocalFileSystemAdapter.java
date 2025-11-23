package com.nskhoa.designpattern.STRUCTURAL.adapter.example11;

public class LocalFileSystemAdapter implements FileSystem {
    private LocalFileSystem local = new LocalFileSystem();
    public void readFile(String path) {
        local.readLocalFile(path);
    }
}
