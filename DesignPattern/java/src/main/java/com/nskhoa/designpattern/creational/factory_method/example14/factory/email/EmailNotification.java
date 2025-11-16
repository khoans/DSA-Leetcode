package com.nskhoa.designpattern.CREATIONAL.factory_method.example14.factory.email;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example14.factory.Notification;

public class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Email: " + message);
    }

}
