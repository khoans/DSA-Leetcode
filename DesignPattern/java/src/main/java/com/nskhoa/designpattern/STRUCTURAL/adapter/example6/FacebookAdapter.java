package com.nskhoa.designpattern.STRUCTURAL.adapter.example6;

public class FacebookAdapter implements SocialMediaAPI {
    private FacebookAPI facebook = new FacebookAPI();

    public void postStatus(String message) {
        facebook.post(message);
    }
}
