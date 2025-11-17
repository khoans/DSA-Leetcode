package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example80;

public class FCMHandler implements Handler {
    public void handle(String notification) {
        System.out.println("FCM Handled: " + notification);
    }
}
