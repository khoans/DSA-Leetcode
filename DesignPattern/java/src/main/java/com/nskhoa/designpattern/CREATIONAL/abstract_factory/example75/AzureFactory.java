package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example75;

public class AzureFactory implements CloudStorageAbstractFactory {
    public Storage createStorage() {
        return new AzureStorage();
    }

    public Uploader createUploader() {
        return new AzureUploader();
    }
}
