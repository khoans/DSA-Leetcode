package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example36;

public class ExpressRouter implements Router {
    public void route(String path) {
        System.out.println("Express Routed: " + path);
    }
}
