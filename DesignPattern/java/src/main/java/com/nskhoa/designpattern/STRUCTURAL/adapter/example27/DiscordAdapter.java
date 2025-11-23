package com.nskhoa.designpattern.STRUCTURAL.adapter.example27;

public class DiscordAdapter implements MessagingService {
    private DiscordService discord = new DiscordService();

    public void sendMessage(String channel, String message) {
        discord.sendDiscordMessage(channel, message);
    }
}
