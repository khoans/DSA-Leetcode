package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example61;

public class Runner {
    public static void main(String[] args) {
        EventBusAbstractFactory factory = new SyncFactory();
        Publisher publisher = factory.createPublisher();
        Subscriber subscriber = factory.createSubscriber();

        publisher.publish("UserLoggedIn");
        subscriber.subscribe("UserLoggedIn");
    }
}
