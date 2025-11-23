package com.nskhoa.designpattern.STRUCTURAL.bridge.example16;

public class BridgePatternExample {
    public static void main(String[] args) {
        CMSClient desktopWordPress = new DesktopCMSClient(new WordPressSystem());
        CMSClient mobileWordPress = new MobileCMSClient(new WordPressSystem());
        CMSClient desktopDrupal = new DesktopCMSClient(new DrupalSystem());
        CMSClient mobileDrupal = new MobileCMSClient(new DrupalSystem());

        desktopWordPress.display();
        mobileWordPress.display();
        desktopDrupal.display();
        mobileDrupal.display();
    }
}
