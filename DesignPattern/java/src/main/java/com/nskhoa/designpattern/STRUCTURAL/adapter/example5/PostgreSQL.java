package com.nskhoa.designpattern.STRUCTURAL.adapter.example5;

public class PostgreSQL {
    void start() { System.out.println("PostgreSQL connected"); }
    void exec(String q) { System.out.println("PostgreSQL query: " + q); }
}
