package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example78;

public interface EmailTemplateAbstractFactory {
    Template createTemplate();

    Renderer createRenderer();
}

