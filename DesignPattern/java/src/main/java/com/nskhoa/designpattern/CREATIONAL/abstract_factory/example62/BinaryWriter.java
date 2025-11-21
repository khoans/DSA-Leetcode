package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example62;

public class BinaryWriter implements Writer {
    public void write(String data, String path) {
        System.out.println("Binary Written to " + path);
    }
}
