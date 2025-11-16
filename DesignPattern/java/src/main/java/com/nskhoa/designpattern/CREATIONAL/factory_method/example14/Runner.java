package com.nskhoa.designpattern.CREATIONAL.factory_method.example14;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example14.factory.Notification;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example14.factory.NotificationFactory;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example14.factory.email.EmailFactory;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example14.factory.sms.SMSFactory;

public class Runner {
    public static void main(String[] args) {
        NotificationFactory smsFactory = new SMSFactory();
        Notification smsNotification = smsFactory.createNotification();
        smsNotification.send("Hello via SMS!");

        NotificationFactory emailFactory = new EmailFactory();
        Notification emailNotification = emailFactory.createNotification();
        emailNotification.send("Hello via Email!");

    }
}
