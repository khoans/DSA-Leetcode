package com.nskhoa.designpattern.STRUCTURAL.adapter.example12;

public class LDAPService {
    boolean ldapAuth(String user, String pass) {
        System.out.println("LDAP auth for user: " + user);
        return true;
    }
}
