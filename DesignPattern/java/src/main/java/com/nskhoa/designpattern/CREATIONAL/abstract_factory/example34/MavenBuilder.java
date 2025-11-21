package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example34;

public class MavenBuilder implements Builder {
    public void build(String project) {
        System.out.println("Maven Built: " + project);
    }
}
