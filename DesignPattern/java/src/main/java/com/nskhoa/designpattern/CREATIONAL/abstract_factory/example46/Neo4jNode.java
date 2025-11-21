package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example46;

public class Neo4jNode implements Node {
    public void addProperty(String prop) {
        System.out.println("Neo4j Node Property: " + prop);
    }
}
