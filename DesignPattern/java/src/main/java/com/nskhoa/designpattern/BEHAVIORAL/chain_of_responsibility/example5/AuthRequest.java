package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example5;

// Request class
public class AuthRequest {
    private String credentials;

    public AuthRequest(String credentials) {
        this.credentials = credentials;
    }

    public String getCredentials() {
        return credentials;
    }
}
