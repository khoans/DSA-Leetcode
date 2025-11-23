package com.nskhoa.designpattern.STRUCTURAL.bridge.example14;

public abstract class CloudClient {
    protected CloudPlatform platform;
    protected CloudClient(CloudPlatform platform) { this.platform = platform; }
    abstract void deploy(String appName);
}
