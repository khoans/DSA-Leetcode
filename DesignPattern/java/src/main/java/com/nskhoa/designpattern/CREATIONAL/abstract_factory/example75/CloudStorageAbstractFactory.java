package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example75;

public interface CloudStorageAbstractFactory {
    Storage createStorage();

    Uploader createUploader();
}

