package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example5;

public class TwoFactorAuth extends AuthHandler {
    @Override
    public void authenticate(AuthRequest request) {
        if (request
                .getCredentials()
                .contains("2FA")) {
            System.out.println("Two-factor authentication passed.");
        }
        else {
            System.out.println("Two-factor authentication failed.");
        }
    }
}
