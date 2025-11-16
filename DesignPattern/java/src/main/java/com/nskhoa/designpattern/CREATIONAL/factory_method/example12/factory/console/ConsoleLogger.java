package com.nskhoa.designpattern.CREATIONAL.factory_method.example12.factory.console;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example12.factory.Logger;

public class ConsoleLogger implements Logger {
    public void log(String message) {
        System.out.println("Console: " + message);
    }
}
