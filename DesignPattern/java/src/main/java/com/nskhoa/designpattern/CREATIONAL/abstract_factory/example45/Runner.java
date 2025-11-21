package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example45;

// Usage: NotificationAbstractFactory factory = new EmailFactory(); Sender sender = factory.createSender(); sender.send("Alert");
public class Runner {
    public static void main(String[] args) {
        NotificationAbstractFactory factory = new EmailFactory();
        Sender sender = factory.createSender();
        Formatter formatter = factory.createFormatter();
        String message = formatter.format("This is an alert!");
        sender.send(message);
    }
}
