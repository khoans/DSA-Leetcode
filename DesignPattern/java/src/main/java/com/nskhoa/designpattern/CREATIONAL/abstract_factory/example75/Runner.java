package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example75;

public class Runner {
    public static void main(String[] args) {
        CloudStorageAbstractFactory factory = new S3Factory();
        Storage storage = factory.createStorage();
        Uploader uploader = factory.createUploader();

        String file = storage.store("file.txt");
        uploader.upload(file);

        factory = new AzureFactory();
        storage = factory.createStorage();
        uploader = factory.createUploader();

        file = storage.store("file.txt");
        uploader.upload(file);
    }
}
