package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example80;

public class FCMPusher implements Pusher {
    public void push(String message) {
        System.out.println("FCM Pushed: " + message);
    }
}
