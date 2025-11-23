package com.nskhoa.designpattern.STRUCTURAL.adapter.example12;

public class LDAPAdapter implements Authenticator {
    private LDAPService ldap = new LDAPService();

    public boolean authenticate(String user, String pass) {
        return ldap.ldapAuth(user, pass);
    }
}
