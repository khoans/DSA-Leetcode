package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example75;

public class AzureUploader implements Uploader {
    public void upload(String data) {
        System.out.println("Azure Uploaded: " + data);
    }
}
