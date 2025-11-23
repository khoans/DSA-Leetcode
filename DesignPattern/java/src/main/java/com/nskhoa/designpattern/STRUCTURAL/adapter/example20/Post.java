package com.nskhoa.designpattern.STRUCTURAL.adapter.example20;

public class Post {
    private final String user;
    private final String content;

    Post(String user, String content) {
        this.user = user;
        this.content = content;
    }

    String getUser() {
        return user;
    }

    String getContent() {
        return content;
    }
}
