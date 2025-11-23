package com.nskhoa.designpattern.STRUCTURAL.adapter.example20;

public class FacebookAdapter implements SocialMediaAPI {
    private FacebookAPI facebook = new FacebookAPI();
    public void postUpdate(String message) {
        facebook.facebookPost(message);
    }
}
