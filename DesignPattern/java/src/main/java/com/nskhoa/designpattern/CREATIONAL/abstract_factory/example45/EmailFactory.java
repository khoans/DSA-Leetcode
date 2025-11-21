package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example45;

public class EmailFactory implements NotificationAbstractFactory {
    public Sender createSender() {
        return new EmailSender();
    }

    public Formatter createFormatter() {
        return new EmailFormatter();
    }
}
