package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example75;

public class S3Uploader implements Uploader {
    public void upload(String data) {
        System.out.println("S3 Uploaded: " + data);
    }
}
