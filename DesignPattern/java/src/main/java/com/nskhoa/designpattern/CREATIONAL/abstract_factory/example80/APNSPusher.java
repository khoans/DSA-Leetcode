package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example80;

public class APNSPusher implements Pusher {
    public void push(String message) {
        System.out.println("APNS Pushed: " + message);
    }
}
