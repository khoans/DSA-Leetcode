package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example78;

public class HTMLTemplate implements Template {
    public String getContent(String data) {
        return "<html><body>" + data + "</body></html>";
    }
}
