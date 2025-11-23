package com.nskhoa.designpattern.STRUCTURAL.adapter.example28;

public class Client {
    public static void main(String[] args) {
        VideoConferenceService zoomMeeting = new ZoomAdapter();
        zoomMeeting.startMeeting("Zoom123");

        VideoConferenceService teamsMeeting = new TeamsAdapter();
        teamsMeeting.startMeeting("Teams456");

        VideoConferenceService googleMeet = new GoogleMeetAdapter();
        googleMeet.startMeeting("Meet789");
    }
}
