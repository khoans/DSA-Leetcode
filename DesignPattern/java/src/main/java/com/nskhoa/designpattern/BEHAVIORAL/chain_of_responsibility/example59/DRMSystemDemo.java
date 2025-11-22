package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example59;

public class DRMSystemDemo {
    public static void main(String[] args) {
        DRMHandler licenseVerifier = new LicenseVerifier();
        DRMHandler restrictionsEnforcer = new RestrictionsEnforcer();
        DRMHandler usageLogger = new UsageLogger();

        licenseVerifier.setNextHandler(restrictionsEnforcer);
        restrictionsEnforcer.setNextHandler(usageLogger);

        ContentRequest request = new ContentRequest("UserA", true);
        licenseVerifier.handle(request);
    }
}

