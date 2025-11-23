package com.nskhoa.designpattern.STRUCTURAL.adapter.example8;

public class AWSAdapter implements CloudService {
    private AWSService aws = new AWSService();

    public void deploy() {
        aws.deployToAws();
    }
}
