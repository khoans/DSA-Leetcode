package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example75;

public class S3Storage implements Storage {
    public String store(String file) {
        return "S3 Stored: " + file;
    }
}
