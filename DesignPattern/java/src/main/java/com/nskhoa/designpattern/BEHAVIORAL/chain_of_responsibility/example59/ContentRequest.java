package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example59;

public class ContentRequest {
    private String userId;
    private boolean licenseValid;
    private boolean restrictionsEnforced;

    public ContentRequest(String userId, boolean licenseValid) {
        this.userId = userId;
        this.licenseValid = licenseValid;
    }

    public String getUserId() { return userId; }
    public boolean isLicenseValid() { return licenseValid; }
    public void setRestrictionsEnforced(boolean val) { restrictionsEnforced = val; }
}
