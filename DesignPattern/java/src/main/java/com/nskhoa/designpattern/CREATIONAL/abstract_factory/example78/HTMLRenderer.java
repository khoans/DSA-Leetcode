package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example78;

public class HTMLRenderer implements Renderer {
    public String render(String template) {
        return "Rendered HTML: " + template;
    }
}
