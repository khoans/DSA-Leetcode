package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example7;

public class ScandinavianFactory implements FurnitureFactory {
    public Table createTable() {
        return new ScanTable();
    }

    public Chair createChair() {
        return new ScanChair();
    }
}
