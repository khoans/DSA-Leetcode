package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example57;

public class MySQLDriver implements Driver {
    public void connect(String url) {
        System.out.println("MySQL Connected: " + url);
    }
}
