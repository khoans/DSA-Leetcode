package com.nskhoa.designpattern.STRUCTURAL.bridge.example14;

public class AWSPlatform implements CloudPlatform {
    public void deployApp(String appName) {
        System.out.println("Deploying " + appName + " to AWS");
    }
}
