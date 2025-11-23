package com.nskhoa.designpattern.STRUCTURAL.adapter.example11;

public class CloudStorageAdapter implements FileSystem {
    private CloudStorage cloud = new CloudStorage();
    public void readFile(String fileId) {
        cloud.downloadFile(fileId);
    }
}
