package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example13;

// Request class
public class AccessRequest {
    private String userRole;

    public AccessRequest(String userRole) {
        this.userRole = userRole;
    }

    public String getUserRole() {
        return userRole;
    }
}
