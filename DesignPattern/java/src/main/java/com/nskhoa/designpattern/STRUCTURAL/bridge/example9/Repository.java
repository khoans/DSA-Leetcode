package com.nskhoa.designpattern.STRUCTURAL.bridge.example9;

public abstract class Repository {
    protected DataStorage storage;

    Repository(DataStorage storage) {
        this.storage = storage;
    }

    abstract void saveData(String data);
}
