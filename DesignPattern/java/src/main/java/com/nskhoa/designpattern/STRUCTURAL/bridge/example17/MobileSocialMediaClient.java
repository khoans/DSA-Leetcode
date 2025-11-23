package com.nskhoa.designpattern.STRUCTURAL.bridge.example17;

public class MobileSocialMediaClient extends SocialMediaClient {
    public MobileSocialMediaClient(SocialMediaSystem system) { super(system); }
    public void displayPosts() {
        System.out.print("Mobile UI: ");
        system.showPosts();
    }
}
