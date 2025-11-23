package com.nskhoa.designpattern.STRUCTURAL.adapter.example5;

// Adaptees with different APIs
public class MySQL {
    void open() { System.out.println("MySQL connected"); }
    void runQuery(String q) { System.out.println("MySQL query: " + q); }
}
