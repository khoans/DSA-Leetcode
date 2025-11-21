package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example57;

public class PostgreSQLDriver implements Driver {
    public void connect(String url) {
        System.out.println("PostgreSQL Connected: " + url);
    }
}
