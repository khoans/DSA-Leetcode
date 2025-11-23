package com.nskhoa.designpattern.STRUCTURAL.bridge.example16;

public class DesktopCMSClient extends CMSClient {
    public DesktopCMSClient(CMSSystem cms) { super(cms); }
    public void display() {
        System.out.print("Desktop UI: ");
        cms.showContent();
    }
}
