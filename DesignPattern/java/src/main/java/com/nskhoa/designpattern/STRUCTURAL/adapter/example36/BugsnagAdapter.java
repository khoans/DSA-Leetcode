package com.nskhoa.designpattern.STRUCTURAL.adapter.example36;

public class BugsnagAdapter implements ErrorTracker {
    private Bugsnag bugsnag = new Bugsnag();
    public void trackError(String errorMessage) {
        bugsnag.bugsnagTrack(errorMessage);
    }
}
