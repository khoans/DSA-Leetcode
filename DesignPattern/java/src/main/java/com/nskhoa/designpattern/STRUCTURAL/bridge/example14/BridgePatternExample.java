package com.nskhoa.designpattern.STRUCTURAL.bridge.example14;

public class BridgePatternExample {
    public static void main(String[] args) {
        CloudClient webUIOnAWS = new WebCloudClient(new AWSPlatform());
        webUIOnAWS.deploy("MyApp");

        CloudClient mobileUIOnAzure = new MobileCloudClient(new AzurePlatform());
        mobileUIOnAzure.deploy("MyApp");

        CloudClient desktopUIOnAWS = new DesktopCloudClient(new AWSPlatform());
        desktopUIOnAWS.deploy("MyApp");
    }
}
