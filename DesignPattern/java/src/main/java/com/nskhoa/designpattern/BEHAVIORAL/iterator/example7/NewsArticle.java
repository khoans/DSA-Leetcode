package com.nskhoa.designpattern.BEHAVIORAL.iterator.example7;

public class NewsArticle {
    private final String headline;
    private final String content;

    NewsArticle(String headline, String content) { this.headline = headline; this.content = content; }
    String getHeadline() { return headline; }
    String getContent() { return content; }
}
