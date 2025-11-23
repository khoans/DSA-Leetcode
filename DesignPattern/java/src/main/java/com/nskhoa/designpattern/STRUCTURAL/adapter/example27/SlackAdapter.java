package com.nskhoa.designpattern.STRUCTURAL.adapter.example27;

public class SlackAdapter implements MessagingService {
    private SlackService slack = new SlackService();

    public void sendMessage(String channel, String message) {
        slack.sendSlackMessage(channel, message);
    }
}
