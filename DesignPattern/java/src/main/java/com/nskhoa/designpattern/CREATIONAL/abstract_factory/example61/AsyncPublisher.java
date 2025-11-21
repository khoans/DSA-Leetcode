package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example61;

public class AsyncPublisher implements Publisher {
    public void publish(String event) {
        System.out.println("Async Published: " + event);
    }
}
