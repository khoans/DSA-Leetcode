package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example18;

// Request class
public class Message {
    private String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
