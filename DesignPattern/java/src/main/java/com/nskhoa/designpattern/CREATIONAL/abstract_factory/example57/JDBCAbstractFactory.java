package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example57;

public interface JDBCAbstractFactory {
    Driver createDriver();

    Connection createConnection();
}
