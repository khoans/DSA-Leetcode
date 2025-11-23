package com.nskhoa.designpattern.STRUCTURAL.adapter.example36;

public class Client {
    private ErrorTracker errorTracker;

    public Client(ErrorTracker errorTracker) {
        this.errorTracker = errorTracker;
    }

    public void logError(String errorMessage) {
        errorTracker.trackError(errorMessage);
    }

    public static void main(String[] args) {
        ErrorTracker sentryAdapter = new SentryAdapter();
        ErrorTracker rollbarAdapter = new RollbarAdapter();
        ErrorTracker bugsnagAdapter = new BugsnagAdapter();

        Client sentryClient = new Client(sentryAdapter);
        Client rollbarClient = new Client(rollbarAdapter);
        Client bugsnagClient = new Client(bugsnagAdapter);

        sentryClient.logError("NullPointerException at line 42");
        rollbarClient.logError("ArrayIndexOutOfBoundsException at line 88");
        bugsnagClient.logError("IllegalArgumentException at line 15");
    }
}
