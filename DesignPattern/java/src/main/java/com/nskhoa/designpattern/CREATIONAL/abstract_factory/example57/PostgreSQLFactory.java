package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example57;

public class PostgreSQLFactory implements JDBCAbstractFactory {
    public Driver createDriver() {
        return new PostgreSQLDriver();
    }

    public Connection createConnection() {
        return new PostgreSQLConnection();
    }
}
