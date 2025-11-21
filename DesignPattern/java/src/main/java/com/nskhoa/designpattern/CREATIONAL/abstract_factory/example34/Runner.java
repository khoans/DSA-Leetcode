package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example34;

// Usage: BuildAbstractFactory factory = new MavenFactory(); Builder builder = factory.createBuilder(); builder.build("app");
public class Runner {
    public static void main(String[] args) {
        BuildAbstractFactory factory = new MavenFactory();
        Builder builder = factory.createBuilder();
        Tester tester = factory.createTester();

        builder.build("MyProject");
        tester.test("MyModule");
    }
}
