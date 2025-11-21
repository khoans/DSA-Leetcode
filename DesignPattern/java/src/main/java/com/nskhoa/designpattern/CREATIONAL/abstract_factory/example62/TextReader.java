package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example62;

public class TextReader implements Reader {
    public String read(String path) {
        return "Text Read from " + path;
    }
}
