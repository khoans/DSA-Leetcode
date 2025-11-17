package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example12;

public interface DatabaseAbstractFactory {
    Driver createDriver();

    Connection createConnection();
}

// Usage: DatabaseAbstractFactory factory = new MySQLFactory(); Driver driver = factory.createDriver(); driver.load();

