package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example46;

public class OrientEdge implements Edge {
    public void connect(String to) {
        System.out.println("Orient Edge Connected: " + to);
    }
}
