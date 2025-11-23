package com.nskhoa.designpattern.STRUCTURAL.adapter.example12;

public class Client {
    private Authenticator auth;

    public Client(Authenticator auth) {
        this.auth = auth;
    }

    public void login(String user, String pass) {
        if (auth.authenticate(user, pass)) {
            System.out.println("Login successful for user: " + user);
        }
        else {
            System.out.println("Login failed for user: " + user);
        }
    }

    public static void main(String[] args) {
        Authenticator oauthAuth = new OAuthAdapter();
        Authenticator ldapAuth = new LDAPAdapter();

        Client oauthClient = new Client(oauthAuth);
        Client ldapClient = new Client(ldapAuth);

        oauthClient.login("user1", "oauth_token_123");
        ldapClient.login("user2", "password456");
    }
}
