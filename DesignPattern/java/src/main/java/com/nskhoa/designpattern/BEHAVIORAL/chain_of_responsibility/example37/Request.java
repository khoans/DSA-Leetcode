package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example37;

// Request class
public class Request {
    private String userRole;
    private String requestType;

    public Request(String userRole, String requestType) {
        this.userRole = userRole;
        this.requestType = requestType;
    }

    public String getUserRole() {
        return userRole;
    }

    public String getRequestType() {
        return requestType;
    }
}
