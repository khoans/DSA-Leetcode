package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example13;

public class ConsoleAppender implements Appender {
    public void append(String data) {
        System.out.println("Console Append: " + data);
    }
}
