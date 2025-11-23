package com.nskhoa.designpattern.STRUCTURAL.adapter.example28;

public class ZoomAdapter implements VideoConferenceService {
    private ZoomService zoom = new ZoomService();

    public void startMeeting(String meetingId) {
        zoom.zoomStart(meetingId);
    }
}
