package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example61;

public class AsyncFactory implements EventBusAbstractFactory {
    public Publisher createPublisher() {
        return new AsyncPublisher();
    }

    public Subscriber createSubscriber() {
        return new AsyncSubscriber();
    }
}
