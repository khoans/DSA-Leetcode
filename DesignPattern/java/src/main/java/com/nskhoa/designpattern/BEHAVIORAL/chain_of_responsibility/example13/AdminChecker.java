package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example13;

// Concrete Handlers
public class AdminChecker extends AccessChecker {
    @Override
    public void checkAccess(AccessRequest request) {
        if ("admin".equals(request.getUserRole())) {
            System.out.println("Access granted to admin");
        }
        else if (next != null) {
            next.checkAccess(request);
        }
        else {
            System.out.println("Access denied");
        }
    }
}
