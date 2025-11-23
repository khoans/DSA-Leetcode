package com.nskhoa.designpattern.STRUCTURAL.bridge.example17;

public class Client {
    public static void main(String[] args) {
        SocialMediaClient mobileFacebook = new MobileSocialMediaClient(new FacebookSystem());
        mobileFacebook.displayPosts();

        SocialMediaClient webTwitter = new WebSocialMediaClient(new TwitterSystem());
        webTwitter.displayPosts();
    }
}
