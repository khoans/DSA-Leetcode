package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example57;

public class Runner {
    public static void main(String[] args) {
        JDBCAbstractFactory factory = new MySQLFactory();
        Driver driver = factory.createDriver();
        Connection connection = factory.createConnection();

        driver.connect("jdbc:mysql://localhost/db");
        connection.query("SELECT * FROM users");

        factory = new PostgreSQLFactory();
        driver = factory.createDriver();
        connection = factory.createConnection();

        driver.connect("jdbc:postgresql://localhost/db");
        connection.query("SELECT * FROM employees");
    }
}
