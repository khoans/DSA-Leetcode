package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example78;

public class PlainTextFactory implements EmailTemplateAbstractFactory {
    public Template createTemplate() {
        return new PlainTextTemplate();
    }

    public Renderer createRenderer() {
        return new PlainTextRenderer();
    }
}
