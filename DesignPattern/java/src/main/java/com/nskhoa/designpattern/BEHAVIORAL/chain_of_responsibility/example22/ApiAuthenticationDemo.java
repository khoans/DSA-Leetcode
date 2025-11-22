package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example22;

// Client runner
public class ApiAuthenticationDemo {
    public static void main(String[] args) {
        Authenticator apiKeyAuth = new ApiKeyAuthenticator();
        Authenticator oauthAuth = new OAuthAuthenticator();
        Authenticator jwtAuth = new JwtAuthenticator();

        apiKeyAuth.setNextAuthenticator(oauthAuth);
        oauthAuth.setNextAuthenticator(jwtAuth);

        ApiRequest req1 = new ApiRequest("validApiKey", null, null);
        ApiRequest req2 = new ApiRequest(null, "validOAuth", null);
        ApiRequest req3 = new ApiRequest(null, null, "validJWT");
        ApiRequest req4 = new ApiRequest(null, null, null);

        System.out.println("Request 1:");
        apiKeyAuth.authenticate(req1);

        System.out.println("\nRequest 2:");
        apiKeyAuth.authenticate(req2);

        System.out.println("\nRequest 3:");
        apiKeyAuth.authenticate(req3);

        System.out.println("\nRequest 4:");
        apiKeyAuth.authenticate(req4);
    }
}

