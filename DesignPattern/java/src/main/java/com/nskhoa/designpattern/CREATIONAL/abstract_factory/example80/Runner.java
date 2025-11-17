package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example80;

public class Runner {
    public static void main(String[] args) {
        PushNotificationAbstractFactory fcmFactory = new FCMFactory();
        Pusher fcmPusher = fcmFactory.createPusher();
        Handler fcmHandler = fcmFactory.createHandler();
        fcmPusher.push("Hello FCM");
        fcmHandler.handle("New FCM Notification");

        PushNotificationAbstractFactory apnsFactory = new APNSFactory();
        Pusher apnsPusher = apnsFactory.createPusher();
        Handler apnsHandler = apnsFactory.createHandler();
        apnsPusher.push("Hello APNS");
        apnsHandler.handle("New APNS Notification");
    }
}
