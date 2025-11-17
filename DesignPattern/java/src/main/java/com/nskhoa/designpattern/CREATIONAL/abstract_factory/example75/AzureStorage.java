package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example75;

public class AzureStorage implements Storage {
    public String store(String file) {
        return "Azure Stored: " + file;
    }
}
