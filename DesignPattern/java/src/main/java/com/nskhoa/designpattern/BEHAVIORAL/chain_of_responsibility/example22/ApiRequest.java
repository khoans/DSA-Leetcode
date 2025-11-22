package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example22;

// Request class
public class ApiRequest {
    private String apiKey;
    private String oauthToken;
    private String jwt;

    public ApiRequest(String apiKey, String oauthToken, String jwt) {
        this.apiKey = apiKey;
        this.oauthToken = oauthToken;
        this.jwt = jwt;
    }

    public String getApiKey() { return apiKey; }
    public String getOauthToken() { return oauthToken; }
    public String getJwt() { return jwt; }
}
