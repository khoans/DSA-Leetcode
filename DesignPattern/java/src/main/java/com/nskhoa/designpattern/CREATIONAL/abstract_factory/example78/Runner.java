package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example78;

public class Runner {
    public static void main(String[] args) {
        EmailTemplateAbstractFactory factory = new HTMLFactory();
        Template template = factory.createTemplate();
        Renderer renderer = factory.createRenderer();
        String content = template.getContent("Hello, World!");
        String renderedContent = renderer.render(content);
        System.out.println(renderedContent);
    }
}
