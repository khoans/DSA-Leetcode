package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example24;

public class APISender implements Sender {
    public void send(String message) {
        System.out.println("API Sent: " + message);
    }
}
