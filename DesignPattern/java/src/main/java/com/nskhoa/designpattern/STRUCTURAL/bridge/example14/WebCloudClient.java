package com.nskhoa.designpattern.STRUCTURAL.bridge.example14;

public class WebCloudClient extends CloudClient {
    public WebCloudClient(CloudPlatform platform) { super(platform); }
    public void deploy(String appName) {
        System.out.print("Web UI: ");
        platform.deployApp(appName);
    }
}
