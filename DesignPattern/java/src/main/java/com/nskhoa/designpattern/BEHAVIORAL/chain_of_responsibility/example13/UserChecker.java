package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example13;

public class UserChecker extends AccessChecker {
    @Override
    public void checkAccess(AccessRequest request) {
        if ("user".equals(request.getUserRole())) {
            System.out.println("Access granted to user");
        }
        else if (next != null) {
            next.checkAccess(request);
        }
        else {
            System.out.println("Access denied");
        }
    }
}
