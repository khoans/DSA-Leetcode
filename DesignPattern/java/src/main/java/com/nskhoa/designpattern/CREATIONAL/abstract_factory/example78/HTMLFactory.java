package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example78;

public class HTMLFactory implements EmailTemplateAbstractFactory {
    public Template createTemplate() {
        return new HTMLTemplate();
    }

    public Renderer createRenderer() {
        return new HTMLRenderer();
    }
}
