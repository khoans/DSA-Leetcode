package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example59;

public class LicenseVerifier extends DRMHandler {
    @Override
    public void handle(ContentRequest request) {
        if (request.isLicenseValid()) {
            System.out.println("License verified for user " + request.getUserId());
            if (nextHandler != null) nextHandler.handle(request);
        } else {
            System.out.println("Invalid license for user " + request.getUserId());
        }
    }
}
