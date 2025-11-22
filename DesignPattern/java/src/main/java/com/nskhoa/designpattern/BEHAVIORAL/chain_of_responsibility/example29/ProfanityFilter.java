package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example29;

// Concrete Handlers
public class ProfanityFilter extends ModerationHandler {
    @Override
    public void moderate(ChatMessage message) {
        if (message
                .getContent()
                .toLowerCase()
                .contains("badword")) {
            System.out.println("ProfanityFilter: Message contains profanity. Blocked.");
        }
        else if (nextHandler != null) {
            nextHandler.moderate(message);
        }
        else {
            System.out.println("Message passed moderation.");
        }
    }
}
