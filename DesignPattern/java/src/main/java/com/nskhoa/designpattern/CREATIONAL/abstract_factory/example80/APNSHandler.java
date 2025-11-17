package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example80;

public class APNSHandler implements Handler {
    public void handle(String notification) {
        System.out.println("APNS Handled: " + notification);
    }
}
