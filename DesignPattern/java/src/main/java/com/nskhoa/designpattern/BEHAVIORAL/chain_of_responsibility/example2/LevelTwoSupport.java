package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example2;

public class LevelTwoSupport extends SupportHandler {
    @Override
    public void handleTicket(SupportTicket ticket) {
        if (ticket.getComplexityLevel() <= 2) {
            System.out.println("Level 2 support handled the ticket.");
        } else if (nextHandler != null) {
            nextHandler.handleTicket(ticket);
        }
    }
}
