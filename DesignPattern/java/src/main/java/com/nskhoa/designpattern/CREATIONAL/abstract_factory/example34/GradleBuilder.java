package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example34;

public class GradleBuilder implements Builder {
    public void build(String project) {
        System.out.println("Gradle Built: " + project);
    }
}
