package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example27;

public class YAMLLoader implements Loader {
    public void load(String file) {
        System.out.println("YAML Loaded: " + file);
    }
}
