package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example42;

public class HibernateEntity implements Entity {
    public void persist(String data) {
        System.out.println("Hibernate Persisted: " + data);
    }
}
