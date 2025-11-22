package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example22;

public class JwtAuthenticator extends Authenticator {
    @Override
    public void authenticate(ApiRequest request) {
        if (request.getJwt() != null && !request.getJwt().isEmpty()) {
            System.out.println("JWT authentication passed.");
        } else {
            System.out.println("Authentication failed.");
        }
    }
}
