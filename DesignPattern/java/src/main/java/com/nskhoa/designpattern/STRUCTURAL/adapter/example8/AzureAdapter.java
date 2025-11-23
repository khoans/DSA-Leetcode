package com.nskhoa.designpattern.STRUCTURAL.adapter.example8;

public class AzureAdapter implements CloudService {
    private AzureService azure = new AzureService();

    public void deploy() {
        azure.deployToAzure();
    }
}
