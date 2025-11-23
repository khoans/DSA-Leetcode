package com.nskhoa.designpattern.STRUCTURAL.adapter.example8;

public class Client {
    private CloudService cloudService;

    public Client(CloudService cloudService) {
        this.cloudService = cloudService;
    }

    public void deployApp() {
        cloudService.deploy();
    }
}
