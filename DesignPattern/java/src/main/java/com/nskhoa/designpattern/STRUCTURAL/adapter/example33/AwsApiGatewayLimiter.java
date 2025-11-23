package com.nskhoa.designpattern.STRUCTURAL.adapter.example33;

public class AwsApiGatewayLimiter {
    boolean awsAllow(String id) {
        System.out.println("AWS API Gateway allowing: " + id);
        return true;
    }
}
