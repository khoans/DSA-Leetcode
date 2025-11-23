package com.nskhoa.designpattern.STRUCTURAL.adapter.example28;

public class GoogleMeetAdapter implements VideoConferenceService {
    private GoogleMeetService meet = new GoogleMeetService();

    public void startMeeting(String meetingId) {
        meet.meetStart(meetingId);
    }
}
