package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example26;

// Request class
public class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() { return content; }
}
