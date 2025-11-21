package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example42;

public class MyBatisEntity implements Entity {
    public void persist(String data) {
        System.out.println("MyBatis Persisted: " + data);
    }
}
