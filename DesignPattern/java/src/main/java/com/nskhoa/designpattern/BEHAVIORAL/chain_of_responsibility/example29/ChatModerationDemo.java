package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example29;

// Client runner
public class ChatModerationDemo {
    public static void main(String[] args) {
        ModerationHandler profanityFilter = new ProfanityFilter();
        ModerationHandler spamFilter = new SpamFilter();
        ModerationHandler policyEnforcement = new PolicyEnforcement();

        profanityFilter.setNextHandler(spamFilter);
        spamFilter.setNextHandler(policyEnforcement);

        ChatMessage msg1 = new ChatMessage("Hello everyone!");
        ChatMessage msg2 = new ChatMessage("This is a badword!");
        ChatMessage msg3 = new ChatMessage("Buy now, limited offer!");

        System.out.println("Moderating msg1:");
        profanityFilter.moderate(msg1);

        System.out.println("\nModerating msg2:");
        profanityFilter.moderate(msg2);

        System.out.println("\nModerating msg3:");
        profanityFilter.moderate(msg3);
    }
}

