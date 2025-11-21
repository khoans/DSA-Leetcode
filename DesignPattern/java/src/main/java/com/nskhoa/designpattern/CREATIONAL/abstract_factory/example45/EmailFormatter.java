package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example45;

public class EmailFormatter implements Formatter {
    public String format(String alert) {
        return "Email: " + alert;
    }
}
