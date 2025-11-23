package com.nskhoa.designpattern.STRUCTURAL.adapter.example20;

public class TwitterAdapter implements SocialMediaAPI {
    private TwitterAPI twitter = new TwitterAPI();
    public void postUpdate(String message) {
        twitter.twitterTweet(message);
    }
}
