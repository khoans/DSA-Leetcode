package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example27;

public class PropertiesLoader implements Loader {
    public void load(String file) {
        System.out.println("Properties Loaded: " + file);
    }
}
