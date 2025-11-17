package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example12;

public class OracleFactory implements DatabaseAbstractFactory {
    public Driver createDriver() {
        return new OracleDriver();
    }

    public Connection createConnection() {
        return new OracleConnection();
    }
}
