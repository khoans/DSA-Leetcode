package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example24;

public interface EmailAbstractFactory {
    Sender createSender();

    Template createTemplate();
}

