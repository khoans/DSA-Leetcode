package com.nskhoa.designpattern.STRUCTURAL.bridge.example9;

public class NoSQLStorage implements DataStorage {
    public void save(String data) {
        System.out.println("Saving to NoSQL DB: " + data);
    }
}
