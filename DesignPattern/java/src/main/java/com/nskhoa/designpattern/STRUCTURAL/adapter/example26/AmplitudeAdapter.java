package com.nskhoa.designpattern.STRUCTURAL.adapter.example26;

public class AmplitudeAdapter implements AnalyticsService {
    private AmplitudeService amplitude = new AmplitudeService();
    public void trackEvent(String event) {
        amplitude.amplitudeTrack(event);
    }
}
