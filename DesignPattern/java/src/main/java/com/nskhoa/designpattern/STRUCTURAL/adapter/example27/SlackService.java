package com.nskhoa.designpattern.STRUCTURAL.adapter.example27;

public class SlackService {
    void sendSlackMessage(String channel, String message) {
        System.out.println("Slack messaging on " + channel + ": " + message);
    }
}
