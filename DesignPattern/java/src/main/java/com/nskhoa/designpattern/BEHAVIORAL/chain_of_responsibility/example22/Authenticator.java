package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example22;

// Abstract Handler
public abstract class Authenticator {
    protected Authenticator nextAuthenticator;

    public void setNextAuthenticator(Authenticator nextAuthenticator) {
        this.nextAuthenticator = nextAuthenticator;
    }

    public abstract void authenticate(ApiRequest request);
}
