package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example21;

public class S3Storage implements Storage {
    public void store(String data) {
        System.out.println("S3 Stored: " + data);
    }
}
