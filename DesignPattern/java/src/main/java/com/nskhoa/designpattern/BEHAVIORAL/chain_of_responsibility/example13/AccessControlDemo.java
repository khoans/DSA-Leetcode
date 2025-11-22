package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example13;

// Client runner
public class AccessControlDemo {
    public static void main(String[] args) {
        AccessChecker admin = new AdminChecker();
        AccessChecker user = new UserChecker();
        AccessChecker guest = new GuestChecker();

        admin.setNext(user);
        user.setNext(guest);

        AccessRequest request1 = new AccessRequest("admin");
        AccessRequest request2 = new AccessRequest("user");
        AccessRequest request3 = new AccessRequest("guest");
        AccessRequest request4 = new AccessRequest("unknown");

        admin.checkAccess(request1);
        admin.checkAccess(request2);
        admin.checkAccess(request3);
        admin.checkAccess(request4);
    }
}

