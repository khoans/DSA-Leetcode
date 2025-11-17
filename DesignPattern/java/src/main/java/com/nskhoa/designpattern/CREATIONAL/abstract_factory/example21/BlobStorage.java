package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example21;

public class BlobStorage implements Storage {
    public void store(String data) {
        System.out.println("Blob Stored: " + data);
    }
}
