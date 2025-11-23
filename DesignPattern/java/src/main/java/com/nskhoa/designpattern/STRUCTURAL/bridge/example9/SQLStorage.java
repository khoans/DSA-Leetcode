package com.nskhoa.designpattern.STRUCTURAL.bridge.example9;

public class SQLStorage implements DataStorage {
    public void save(String data) {
        System.out.println("Saving to SQL DB: " + data);
    }
}
