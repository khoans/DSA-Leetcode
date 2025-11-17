package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example21;

public class AzureFactory implements CloudAbstractFactory {
    public Storage createStorage() {
        return new BlobStorage();
    }

    public Compute createCompute() {
        return new VirtualMachine();
    }
}
