package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example21;

// Usage: CloudAbstractFactory factory = new AWSFactory(); Storage storage = factory.createStorage(); storage.store("file");
public class Runner {
    public static void main(String[] args) {
        CloudAbstractFactory factory = new AWSFactory();
        Storage storage = factory.createStorage();
        Compute compute = factory.createCompute();

        storage.store("file.txt");
        compute.execute("task1");
    }
}
