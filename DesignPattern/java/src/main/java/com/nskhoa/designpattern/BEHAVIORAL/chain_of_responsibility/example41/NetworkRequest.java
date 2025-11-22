package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example41;

public class NetworkRequest {
    private String authToken;
    private String url;

    public NetworkRequest(String authToken, String url) {
        this.authToken = authToken;
        this.url = url;
    }

    public String getAuthToken() {
        return authToken;
    }

    public String getUrl() {
        return url;
    }
}
