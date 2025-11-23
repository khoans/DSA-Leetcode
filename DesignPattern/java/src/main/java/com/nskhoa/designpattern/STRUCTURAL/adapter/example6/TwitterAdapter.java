package com.nskhoa.designpattern.STRUCTURAL.adapter.example6;

public class TwitterAdapter implements SocialMediaAPI {
    private TwitterAPI twitter = new TwitterAPI();

    public void postStatus(String message) {
        twitter.tweet(message);
    }
}
