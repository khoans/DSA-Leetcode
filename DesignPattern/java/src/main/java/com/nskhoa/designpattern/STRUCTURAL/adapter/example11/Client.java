package com.nskhoa.designpattern.STRUCTURAL.adapter.example11;

public class Client {
    public static void main(String[] args) {
        FileSystem localFs = new LocalFileSystemAdapter();
        localFs.readFile("/path/to/local/file.txt");

        FileSystem cloudFs = new CloudStorageAdapter();
        cloudFs.readFile("cloud-file-id-12345");
    }
}
