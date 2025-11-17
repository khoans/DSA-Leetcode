package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example75;

public class S3Factory implements CloudStorageAbstractFactory {
    public Storage createStorage() {
        return new S3Storage();
    }

    public Uploader createUploader() {
        return new S3Uploader();
    }
}
