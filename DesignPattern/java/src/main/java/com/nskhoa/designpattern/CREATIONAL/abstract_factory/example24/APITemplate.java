package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example24;

public class APITemplate implements Template {
    public String format(String content) {
        return "API: " + content;
    }
}
