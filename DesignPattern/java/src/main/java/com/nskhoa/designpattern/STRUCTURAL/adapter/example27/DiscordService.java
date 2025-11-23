package com.nskhoa.designpattern.STRUCTURAL.adapter.example27;

public class DiscordService {
    void sendDiscordMessage(String channel, String message) {
        System.out.println("Discord messaging on " + channel + ": " + message);
    }
}
