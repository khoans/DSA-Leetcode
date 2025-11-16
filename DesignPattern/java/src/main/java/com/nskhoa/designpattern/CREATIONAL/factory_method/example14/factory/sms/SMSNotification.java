package com.nskhoa.designpattern.CREATIONAL.factory_method.example14.factory.sms;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example14.factory.Notification;

public class SMSNotification implements Notification {
    public void send(String message) { System.out.println("SMS: " + message); }
}
