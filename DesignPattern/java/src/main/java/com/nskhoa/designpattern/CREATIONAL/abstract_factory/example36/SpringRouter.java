package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example36;

public class SpringRouter implements Router {
    public void route(String path) {
        System.out.println("Spring Routed: " + path);
    }
}
