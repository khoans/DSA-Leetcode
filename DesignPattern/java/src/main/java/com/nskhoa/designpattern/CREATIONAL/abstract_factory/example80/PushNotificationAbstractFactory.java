package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example80;

public interface PushNotificationAbstractFactory {
    Pusher createPusher();

    Handler createHandler();
}

