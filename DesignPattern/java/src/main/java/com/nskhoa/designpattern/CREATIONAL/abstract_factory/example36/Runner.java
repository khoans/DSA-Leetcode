package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example36;

// Usage: WebAbstractFactory factory = new SpringFactory(); Router router = factory.createRouter(); router.route("/home");
public class Runner {
    public static void main(String[] args) {
        WebAbstractFactory factory = new SpringFactory();
        Router router = factory.createRouter();
        Template template = factory.createTemplate();

        router.route("/home");
        System.out.println(template.render("homeView"));
    }
}
