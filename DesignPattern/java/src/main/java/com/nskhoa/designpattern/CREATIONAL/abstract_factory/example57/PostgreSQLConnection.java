package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example57;

public class PostgreSQLConnection implements Connection {
    public void query(String sql) {
        System.out.println("PostgreSQL Query: " + sql);
    }
}
