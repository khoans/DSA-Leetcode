package com.nskhoa.designpattern.CREATIONAL.factory_method.example14.factory.sms;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example14.factory.Notification;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example14.factory.NotificationFactory;

public class SMSFactory extends NotificationFactory {
    public Notification createNotification() {
        return new SMSNotification();
    }
}
