package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example4;

// Request class
public class Email {
    private String content;

    public Email(String content) {
        this.content = content.toLowerCase();
    }

    public String getContent() {
        return content;
    }
}
