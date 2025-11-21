package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example57;

public class MySQLFactory implements JDBCAbstractFactory {
    public Driver createDriver() {
        return new MySQLDriver();
    }

    public Connection createConnection() {
        return new MySQLConnection();
    }
}
