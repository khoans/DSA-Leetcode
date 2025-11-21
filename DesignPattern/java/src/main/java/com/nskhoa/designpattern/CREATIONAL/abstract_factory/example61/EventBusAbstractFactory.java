package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example61;

public interface EventBusAbstractFactory {
    Publisher createPublisher();

    Subscriber createSubscriber();
}

// Usage: EventBusAbstractFactory factory = new SyncFactory(); Publisher pub = factory.createPublisher(); pub.publish("user.login");

