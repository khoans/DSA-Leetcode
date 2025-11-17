package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example7;

public class AsianFactory implements FurnitureFactory {
    public Table createTable() {
        return new AsianTable();
    }

    public Chair createChair() {
        return new AsianChair();
    }
}
