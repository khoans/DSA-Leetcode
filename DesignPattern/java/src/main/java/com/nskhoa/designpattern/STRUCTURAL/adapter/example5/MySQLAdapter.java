package com.nskhoa.designpattern.STRUCTURAL.adapter.example5;

// Adapter for MySQL
public class MySQLAdapter implements Database {
    private MySQL mySql = new MySQL();
    public void connect() {
        mySql.open();
    }
    public void execute(String query) {
        mySql.runQuery(query);
    }
}
