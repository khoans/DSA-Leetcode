package com.nskhoa.designpattern.STRUCTURAL.adapter.example6;

public class Client {
    public static void main(String[] args) {
        SocialMediaAPI twitter = new TwitterAdapter();
        SocialMediaAPI facebook = new FacebookAdapter();

        twitter.postStatus("Hello Twitter!");
        facebook.postStatus("Hello Facebook!");
    }
}
