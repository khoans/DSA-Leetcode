package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example80;

public class APNSFactory implements PushNotificationAbstractFactory {
    public Pusher createPusher() {
        return new APNSPusher();
    }

    public Handler createHandler() {
        return new APNSHandler();
    }
}
