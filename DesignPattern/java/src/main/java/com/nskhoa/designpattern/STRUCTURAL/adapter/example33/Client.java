package com.nskhoa.designpattern.STRUCTURAL.adapter.example33;

public class Client {
    private RateLimiter rateLimiter;

    public Client(RateLimiter rateLimiter) {
        this.rateLimiter = rateLimiter;
    }

    public void makeRequest(String clientId) {
        if (rateLimiter.allowRequest(clientId)) {
            System.out.println("Request allowed for client: " + clientId);
        } else {
            System.out.println("Request denied for client: " + clientId);
        }
    }

    public static void main(String[] args) {
        RateLimiter cfLimiter = new CloudflareAdapter();
        RateLimiter awsLimiter = new AwsApiGatewayAdapter();
        RateLimiter kongLimiter = new KongAdapter();

        Client cfClient = new Client(cfLimiter);
        Client awsClient = new Client(awsLimiter);
        Client kongClient = new Client(kongLimiter);

        cfClient.makeRequest("client1");
        awsClient.makeRequest("client2");
        kongClient.makeRequest("client3");
    }
}
