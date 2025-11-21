package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example62;

public class TextWriter implements Writer {
    public void write(String data, String path) {
        System.out.println("Text Written to " + path);
    }
}
