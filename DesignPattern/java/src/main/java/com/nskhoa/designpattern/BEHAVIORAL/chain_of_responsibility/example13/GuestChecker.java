package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example13;

public class GuestChecker extends AccessChecker {
    @Override
    public void checkAccess(AccessRequest request) {
        if ("guest".equals(request.getUserRole())) {
            System.out.println("Access granted to guest");
        }
        else {
            System.out.println("Access denied");
        }
    }
}
