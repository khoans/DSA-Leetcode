package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example46;

public class Neo4jEdge implements Edge {
    public void connect(String to) {
        System.out.println("Neo4j Edge Connected: " + to);
    }
}
