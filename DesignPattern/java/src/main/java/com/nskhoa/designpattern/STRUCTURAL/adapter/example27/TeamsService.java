package com.nskhoa.designpattern.STRUCTURAL.adapter.example27;

public class TeamsService {
    void sendTeamsMessage(String channel, String message) {
        System.out.println("Microsoft Teams messaging on " + channel + ": " + message);
    }
}
