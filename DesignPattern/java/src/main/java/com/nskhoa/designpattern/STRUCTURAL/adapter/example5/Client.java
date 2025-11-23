package com.nskhoa.designpattern.STRUCTURAL.adapter.example5;

public class Client {
    public static void main(String[] args) {
        Database mySqlDb = new MySQLAdapter();
        mySqlDb.connect();
        mySqlDb.execute("SELECT * FROM users");

        Database postgreDb = new PostgreSQLAdapter();
        postgreDb.connect();
        postgreDb.execute("SELECT * FROM products");
    }
}
