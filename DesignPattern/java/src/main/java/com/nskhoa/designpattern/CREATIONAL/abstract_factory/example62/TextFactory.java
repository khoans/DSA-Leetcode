package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example62;

public class TextFactory implements IOAbstractFactory {
    public Reader createReader() {
        return new TextReader();
    }

    public Writer createWriter() {
        return new TextWriter();
    }
}
