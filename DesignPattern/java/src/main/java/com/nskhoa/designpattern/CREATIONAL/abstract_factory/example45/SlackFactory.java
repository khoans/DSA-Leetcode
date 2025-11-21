package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example45;

public class SlackFactory implements NotificationAbstractFactory {
    public Sender createSender() {
        return new SlackSender();
    }

    public Formatter createFormatter() {
        return new SlackFormatter();
    }
}
