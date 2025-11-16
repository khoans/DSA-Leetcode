package com.nskhoa.designpattern.creational.factory_method.example14.factory.email;

import com.nskhoa.designpattern.creational.factory_method.example14.factory.Notification;
import com.nskhoa.designpattern.creational.factory_method.example14.factory.NotificationFactory;

public class EmailFactory extends NotificationFactory {
    public Notification createNotification() {
        return new EmailNotification();
    }
}
