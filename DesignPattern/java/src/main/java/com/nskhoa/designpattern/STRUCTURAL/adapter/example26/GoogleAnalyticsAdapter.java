package com.nskhoa.designpattern.STRUCTURAL.adapter.example26;

public class GoogleAnalyticsAdapter implements AnalyticsService {
    private GoogleAnalyticsService ga = new GoogleAnalyticsService();
    public void trackEvent(String event) {
        ga.googleTrack(event);
    }
}
