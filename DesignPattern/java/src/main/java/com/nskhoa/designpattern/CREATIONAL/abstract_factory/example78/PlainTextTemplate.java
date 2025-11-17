package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example78;

public class PlainTextTemplate implements Template {
    public String getContent(String data) {
        return "Plain: " + data;
    }
}
