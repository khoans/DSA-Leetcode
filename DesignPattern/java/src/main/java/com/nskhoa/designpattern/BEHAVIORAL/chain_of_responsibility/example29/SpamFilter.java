package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example29;

public class SpamFilter extends ModerationHandler {
    @Override
    public void moderate(ChatMessage message) {
        if (message
                .getContent()
                .toLowerCase()
                .contains("buy now")) {
            System.out.println("SpamFilter: Message detected as spam. Blocked.");
        }
        else if (nextHandler != null) {
            nextHandler.moderate(message);
        }
        else {
            System.out.println("Message passed moderation.");
        }
    }
}
