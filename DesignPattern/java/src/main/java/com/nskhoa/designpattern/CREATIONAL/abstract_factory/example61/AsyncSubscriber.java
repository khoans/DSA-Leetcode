package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example61;

public class AsyncSubscriber implements Subscriber {
    public void subscribe(String event) {
        System.out.println("Async Subscribed: " + event);
    }
}
