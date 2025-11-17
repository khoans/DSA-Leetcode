package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example13;

public class FileAppender implements Appender {
    public void append(String data) {
        System.out.println("File Append: " + data);
    }
}
