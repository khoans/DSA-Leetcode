package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example45;

public interface NotificationAbstractFactory {
    Sender createSender();

    Formatter createFormatter();
}
