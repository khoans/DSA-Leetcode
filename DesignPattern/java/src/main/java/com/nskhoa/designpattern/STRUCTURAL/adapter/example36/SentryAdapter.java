package com.nskhoa.designpattern.STRUCTURAL.adapter.example36;

public class SentryAdapter implements ErrorTracker {
    private Sentry sentry = new Sentry();
    public void trackError(String errorMessage) {
        sentry.sentryTrack(errorMessage);
    }
}
