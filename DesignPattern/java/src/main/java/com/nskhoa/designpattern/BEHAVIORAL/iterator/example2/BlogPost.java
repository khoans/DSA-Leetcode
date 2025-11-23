package com.nskhoa.designpattern.BEHAVIORAL.iterator.example2;

public class BlogPost {
    private final String title;
    private final String content;

    BlogPost(String title, String content) { this.title = title; this.content = content; }
    String getTitle() { return title; }
    String getContent() { return content; }
}
