package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example30;

public class PythonLoader implements Loader {
    public void load(String path) {
        System.out.println("Python Loaded: " + path);
    }
}
