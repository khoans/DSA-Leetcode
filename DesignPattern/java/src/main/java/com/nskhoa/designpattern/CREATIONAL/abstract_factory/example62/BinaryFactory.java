package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example62;

public class BinaryFactory implements IOAbstractFactory {
    public Reader createReader() {
        return new BinaryReader();
    }

    public Writer createWriter() {
        return new BinaryWriter();
    }
}
