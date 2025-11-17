package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example80;

public class FCMFactory implements PushNotificationAbstractFactory {
    public Pusher createPusher() {
        return new FCMPusher();
    }

    public Handler createHandler() {
        return new FCMHandler();
    }
}
