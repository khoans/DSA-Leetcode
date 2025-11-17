package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example21;

public interface CloudAbstractFactory {
    Storage createStorage();

    Compute createCompute();
}

