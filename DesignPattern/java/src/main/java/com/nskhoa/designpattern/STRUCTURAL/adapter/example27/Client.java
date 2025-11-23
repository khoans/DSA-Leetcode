package com.nskhoa.designpattern.STRUCTURAL.adapter.example27;

public class Client {
    private MessagingService messagingService;

    public Client(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

    public void notify(String channel, String message) {
        messagingService.sendMessage(channel, message);
    }

    public static void main(String[] args) {
        MessagingService slackAdapter = new SlackAdapter();
        MessagingService teamsAdapter = new TeamsAdapter();
        MessagingService discordAdapter = new DiscordAdapter();

        Client slackClient = new Client(slackAdapter);
        Client teamsClient = new Client(teamsAdapter);
        Client discordClient = new Client(discordAdapter);

        slackClient.notify("#general", "Hello via Slack!");
        teamsClient.notify("Development Team", "Hello via Microsoft Teams!");
        discordClient.notify("Gaming Channel", "Hello via Discord!");
    }
}
