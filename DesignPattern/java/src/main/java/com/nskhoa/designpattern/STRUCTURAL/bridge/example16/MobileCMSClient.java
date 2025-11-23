package com.nskhoa.designpattern.STRUCTURAL.bridge.example16;

public class MobileCMSClient extends CMSClient {
    public MobileCMSClient(CMSSystem cms) { super(cms); }
    public void display() {
        System.out.print("Mobile UI: ");
        cms.showContent();
    }
}
