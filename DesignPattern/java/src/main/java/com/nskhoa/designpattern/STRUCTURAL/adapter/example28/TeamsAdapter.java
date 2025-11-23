package com.nskhoa.designpattern.STRUCTURAL.adapter.example28;

public class TeamsAdapter implements VideoConferenceService {
    private TeamsService teams = new TeamsService();

    public void startMeeting(String meetingId) {
        teams.teamsStart(meetingId);
    }
}
