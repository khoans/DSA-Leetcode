package com.nskhoa.designpattern.STRUCTURAL.adapter.example5;

// Adapter for PostgreSQL
public class PostgreSQLAdapter implements Database {
    private PostgreSQL postgre = new PostgreSQL();
    public void connect() {
        postgre.start();
    }
    public void execute(String query) {
        postgre.exec(query);
    }
}
