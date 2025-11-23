package com.nskhoa.designpattern.BEHAVIORAL.iterator.example1;

public class Student {
    private final String id;
    private final String name;
    Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    String getId() { return id; }
    String getName() { return name; }
}
