package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example12;

public class MySQLFactory implements DatabaseAbstractFactory {
    public Driver createDriver() { return new MySQLDriver(); }
    public Connection createConnection() { return new MySQLConnection(); }
}
