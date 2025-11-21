package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example65;

public class SecurityWeaver implements Weaver {
    public void weave(String code) {
        System.out.println("Security Woven: " + code);
    }
}
