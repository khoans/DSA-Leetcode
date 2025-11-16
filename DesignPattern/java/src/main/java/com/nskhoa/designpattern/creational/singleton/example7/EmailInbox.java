package com.nskhoa.designpattern.CREATIONAL.singleton.example7;

import java.util.ArrayList;
import java.util.List;

public class EmailInbox {
    private static EmailInbox instance;
    private List<String> messages = new ArrayList<>();

    private EmailInbox() {
    }

    public static EmailInbox getInstance() {
        if (instance == null) {
            instance = new EmailInbox();
        }
        return instance;
    }

    public void receive(String msg) {
        messages.add(msg);
    }

    public List<String> getMessages() {
        return messages;
    }

    public static void main(String[] args) {
        EmailInbox inbox = EmailInbox.getInstance();
        inbox.receive("Hello! Welcome to your inbox.");
        inbox.receive("Don't forget to check your messages.");

        System.out.println("Inbox Messages: " + inbox.getMessages());
    }
}
