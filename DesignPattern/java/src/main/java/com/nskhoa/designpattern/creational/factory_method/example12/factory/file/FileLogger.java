package com.nskhoa.designpattern.CREATIONAL.factory_method.example12.factory.file;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example12.factory.Logger;

public class FileLogger implements Logger {
    public void log(String message) {
        System.out.println("File: " + message);
    }
}
