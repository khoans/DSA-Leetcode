package com.nskhoa.designpattern.STRUCTURAL.adapter.example20;

public class Client {
    private SocialMediaAPI socialMedia;

    public Client(SocialMediaAPI socialMedia) {
        this.socialMedia = socialMedia;
    }

    public void shareUpdate(String message) {
        socialMedia.postUpdate(message);
    }

    public static void main(String[] args) {
        SocialMediaAPI facebookAdapter = new FacebookAdapter();
        Client facebookClient = new Client(facebookAdapter);
        facebookClient.shareUpdate("Hello Facebook!");

        SocialMediaAPI twitterAdapter = new TwitterAdapter();
        Client twitterClient = new Client(twitterAdapter);
        twitterClient.shareUpdate("Hello Twitter!");
    }
}
