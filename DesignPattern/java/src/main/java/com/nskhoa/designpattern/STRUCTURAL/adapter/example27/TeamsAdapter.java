package com.nskhoa.designpattern.STRUCTURAL.adapter.example27;

public class TeamsAdapter implements MessagingService {
    private TeamsService teams = new TeamsService();

    public void sendMessage(String channel, String message) {
        teams.sendTeamsMessage(channel, message);
    }
}
