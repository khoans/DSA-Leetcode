package com.nskhoa.designpattern.STRUCTURAL.bridge.example17;

public class WebSocialMediaClient extends SocialMediaClient {
    public WebSocialMediaClient(SocialMediaSystem system) { super(system); }
    public void displayPosts() {
        System.out.print("Web UI: ");
        system.showPosts();
    }
}
