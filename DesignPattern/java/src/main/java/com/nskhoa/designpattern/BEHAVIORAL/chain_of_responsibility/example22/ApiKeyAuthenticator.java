package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example22;

// Concrete Handlers
public class ApiKeyAuthenticator extends Authenticator {
    @Override
    public void authenticate(ApiRequest request) {
        if (request.getApiKey() != null && !request.getApiKey().isEmpty()) {
            System.out.println("API Key authentication passed.");
        } else if (nextAuthenticator != null) {
            nextAuthenticator.authenticate(request);
        } else {
            System.out.println("Authentication failed.");
        }
    }
}
