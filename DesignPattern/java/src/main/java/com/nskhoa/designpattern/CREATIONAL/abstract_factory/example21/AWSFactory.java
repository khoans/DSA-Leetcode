package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example21;

public class AWSFactory implements CloudAbstractFactory {
    public Storage createStorage() {
        return new S3Storage();
    }

    public Compute createCompute() {
        return new EC2Compute();
    }
}
