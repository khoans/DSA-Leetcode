package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example61;

public class SyncSubscriber implements Subscriber {
    public void subscribe(String event) {
        System.out.println("Sync Subscribed: " + event);
    }
}
