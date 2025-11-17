package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example78;

public class PlainTextRenderer implements Renderer {
    public String render(String template) {
        return "Rendered Plain: " + template;
    }
}
