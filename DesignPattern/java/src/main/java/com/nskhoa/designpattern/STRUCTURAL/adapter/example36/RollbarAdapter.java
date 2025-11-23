package com.nskhoa.designpattern.STRUCTURAL.adapter.example36;

public class RollbarAdapter implements ErrorTracker {
    private Rollbar rollbar = new Rollbar();
    public void trackError(String errorMessage) {
        rollbar.rollbarTrack(errorMessage);
    }
}
