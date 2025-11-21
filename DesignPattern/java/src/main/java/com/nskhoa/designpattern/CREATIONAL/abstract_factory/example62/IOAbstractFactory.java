package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example62;

public interface IOAbstractFactory {
    Reader createReader();

    Writer createWriter();
}

// Usage: IOAbstractFactory factory = new TextFactory(); Reader reader = factory.createReader(); String content = reader.read("file.txt");

