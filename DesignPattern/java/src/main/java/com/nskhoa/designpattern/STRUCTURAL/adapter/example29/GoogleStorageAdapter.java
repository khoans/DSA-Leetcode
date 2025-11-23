package com.nskhoa.designpattern.STRUCTURAL.adapter.example29;

public class GoogleStorageAdapter implements CloudStorage {
    private GoogleStorage google = new GoogleStorage();

    public void uploadFile(String filename) {
        google.uploadToGoogleCloud(filename);
    }
}
