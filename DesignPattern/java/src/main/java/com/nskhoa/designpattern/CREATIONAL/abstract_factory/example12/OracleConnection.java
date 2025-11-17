package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example12;

public class OracleConnection implements Connection {
    public void connect() {
        System.out.println("Oracle Connected");
    }
}
