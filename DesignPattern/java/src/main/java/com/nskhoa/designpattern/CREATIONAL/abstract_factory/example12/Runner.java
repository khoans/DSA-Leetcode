package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example12;

public class Runner {
    public static void main(String[] args) {
        DatabaseAbstractFactory factory = new MySQLFactory();
        Driver driver = factory.createDriver();
        Connection connection = factory.createConnection();
        driver.load();
        connection.connect();

        factory = new OracleFactory();
        driver = factory.createDriver();
        connection = factory.createConnection();
        driver.load();
        connection.connect();
    }
}
