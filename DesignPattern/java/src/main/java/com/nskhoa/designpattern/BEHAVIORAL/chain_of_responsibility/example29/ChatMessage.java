package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example29;

// Request class
public class ChatMessage {
    private String content;

    public ChatMessage(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
