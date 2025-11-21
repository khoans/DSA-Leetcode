package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example61;

public class SyncPublisher implements Publisher {
    public void publish(String event) {
        System.out.println("Sync Published: " + event);
    }
}
