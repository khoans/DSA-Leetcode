package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example12;

public class MySQLConnection implements Connection {
    public void connect() {
        System.out.println("MySQL Connected");
    }
}
