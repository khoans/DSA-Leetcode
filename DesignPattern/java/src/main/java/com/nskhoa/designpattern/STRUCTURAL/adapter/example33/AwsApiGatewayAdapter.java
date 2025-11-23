package com.nskhoa.designpattern.STRUCTURAL.adapter.example33;

public class AwsApiGatewayAdapter implements RateLimiter {
    private AwsApiGatewayLimiter aws = new AwsApiGatewayLimiter();
    public boolean allowRequest(String clientId) {
        return aws.awsAllow(clientId);
    }
}
