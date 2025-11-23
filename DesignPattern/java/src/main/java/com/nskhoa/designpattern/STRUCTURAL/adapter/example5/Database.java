package com.nskhoa.designpattern.STRUCTURAL.adapter.example5;

public interface Database {
    void connect();
    void execute(String query);
}
