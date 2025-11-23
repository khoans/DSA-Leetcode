package com.nskhoa.designpattern.STRUCTURAL.adapter.example26;

public class MixpanelAdapter implements AnalyticsService {
    private MixpanelService mixpanel = new MixpanelService();
    public void trackEvent(String event) {
        mixpanel.mixpanelTrack(event);
    }
}
