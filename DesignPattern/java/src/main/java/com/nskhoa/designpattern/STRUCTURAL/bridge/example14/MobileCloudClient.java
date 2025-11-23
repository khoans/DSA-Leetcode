package com.nskhoa.designpattern.STRUCTURAL.bridge.example14;

public class MobileCloudClient extends CloudClient {
    public MobileCloudClient(CloudPlatform platform) { super(platform); }
    public void deploy(String appName) {
        System.out.print("Mobile UI: ");
        platform.deployApp(appName);
    }
}
