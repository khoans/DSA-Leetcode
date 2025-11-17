package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example30;

public class JavaLoader implements Loader {
    public void load(String path) {
        System.out.println("Java Loaded: " + path);
    }
}
