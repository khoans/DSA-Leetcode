package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example69;

public class DirectRouter implements Router {
    public String route(String path) {
        return "Direct to " + path;
    }
}
