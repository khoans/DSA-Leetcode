package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example5;

// Client runner
public class AuthFilterDemo {
    public static void main(String[] args) {
        AuthHandler usernamePassword = new UsernamePasswordAuth();
        AuthHandler oauth = new OAuthAuth();
        AuthHandler twoFactor = new TwoFactorAuth();

        usernamePassword.setNextHandler(oauth);
        oauth.setNextHandler(twoFactor);

        AuthRequest req1 = new AuthRequest("username/password OAuth 2FA");
        AuthRequest req2 = new AuthRequest("OAuth");
        AuthRequest req3 = new AuthRequest("username/password");
        AuthRequest req4 = new AuthRequest("no valid credentials");

        System.out.println("Request 1:");
        usernamePassword.authenticate(req1);
        System.out.println("\nRequest 2:");
        usernamePassword.authenticate(req2);
        System.out.println("\nRequest 3:");
        usernamePassword.authenticate(req3);
        System.out.println("\nRequest 4:");
        usernamePassword.authenticate(req4);
    }
}

