package com.nskhoa.designpattern.STRUCTURAL.bridge.example14;

public class DesktopCloudClient extends CloudClient {
    public DesktopCloudClient(CloudPlatform platform) { super(platform); }
    public void deploy(String appName) {
        System.out.print("Desktop UI: ");
        platform.deployApp(appName);
    }
}
