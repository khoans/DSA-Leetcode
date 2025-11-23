package com.nskhoa.designpattern.BEHAVIORAL.iterator.example31;

public class Message {
    private final String sender;
    private final String content;

    Message(String sender, String content) {
        this.sender = sender; this.content = content;
    }

    String getSender() {
        return sender;
    }

    String getContent() {
        return content;
    }
}
