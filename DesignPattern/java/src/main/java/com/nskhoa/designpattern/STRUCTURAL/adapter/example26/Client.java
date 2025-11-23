package com.nskhoa.designpattern.STRUCTURAL.adapter.example26;

public class Client {
    private AnalyticsService analyticsService;
    public Client(AnalyticsService analyticsService) {
        this.analyticsService = analyticsService;
    }
    public void logEvent(String event) {
        analyticsService.trackEvent(event);
    }

    public static void main(String[] args) {
        AnalyticsService gaAdapter = new GoogleAnalyticsAdapter();
        AnalyticsService mixpanelAdapter = new MixpanelAdapter();
        AnalyticsService amplitudeAdapter = new AmplitudeAdapter();

        Client gaClient = new Client(gaAdapter);
        Client mixpanelClient = new Client(mixpanelAdapter);
        Client amplitudeClient = new Client(amplitudeAdapter);

        gaClient.logEvent("User Signed Up");
        mixpanelClient.logEvent("User Purchased Item");
        amplitudeClient.logEvent("User Logged In");
    }
}
