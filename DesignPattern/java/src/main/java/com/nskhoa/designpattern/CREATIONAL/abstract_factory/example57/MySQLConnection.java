package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example57;

public class MySQLConnection implements Connection {
    public void query(String sql) {
        System.out.println("MySQL Query: " + sql);
    }
}
