package com.nskhoa.designpattern.STRUCTURAL.bridge.example17;

public abstract class SocialMediaClient {
    protected SocialMediaSystem system;
    protected SocialMediaClient(SocialMediaSystem system) { this.system = system; }
    abstract void displayPosts();
}
