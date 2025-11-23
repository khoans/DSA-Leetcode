package com.nskhoa.designpattern.STRUCTURAL.adapter.example12;

public class OAuthService {
    boolean oauthLogin(String token) {
        System.out.println("OAuth login with token: " + token);
        return true;
    }
}
