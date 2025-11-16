package com.nskhoa.designpattern.creational.abstract_factory.example91.custom;

import com.nskhoa.designpattern.creational.abstract_factory.example91.Logger;

public class CustomLogger implements Logger {
    public void log(String attack) {
        System.out.println("Custom Logged: " + attack);
    }
}
