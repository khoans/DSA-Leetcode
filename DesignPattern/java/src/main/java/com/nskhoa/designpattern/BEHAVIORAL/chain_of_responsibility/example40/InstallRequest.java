package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example40;

// Request class
public class InstallRequest {
    private boolean systemChecked;
    private boolean filesCopied;
    private boolean settingsConfigured;

    public boolean isSystemChecked() {
        return systemChecked;
    }

    public void setSystemChecked(boolean val) {
        systemChecked = val;
    }

    public boolean isFilesCopied() {
        return filesCopied;
    }

    public void setFilesCopied(boolean val) {
        filesCopied = val;
    }

    public boolean isSettingsConfigured() {
        return settingsConfigured;
    }

    public void setSettingsConfigured(boolean val) {
        settingsConfigured = val;
    }
}
