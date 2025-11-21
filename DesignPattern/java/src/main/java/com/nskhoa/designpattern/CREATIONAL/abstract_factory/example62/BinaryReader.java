package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example62;

public class BinaryReader implements Reader {
    public String read(String path) {
        return "Binary Read from " + path;
    }
}
