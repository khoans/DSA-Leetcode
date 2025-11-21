package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example61;

public class SyncFactory implements EventBusAbstractFactory {
    public Publisher createPublisher() {
        return new SyncPublisher();
    }

    public Subscriber createSubscriber() {
        return new SyncSubscriber();
    }
}
