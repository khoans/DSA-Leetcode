package com.nskhoa.designpattern.BEHAVIORAL.iterator.example9;

public class Document {
    private final String title;
    private final String content;

    Document(String title, String content) {
        this.title = title; this.content = content;
    }

    String getTitle() {
        return title;
    }

    String getContent() {
        return content;
    }
}
