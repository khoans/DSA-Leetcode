package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example45;

public class SlackSender implements Sender {
    public void send(String message) {
        System.out.println("Slack Sent: " + message);
    }
}
