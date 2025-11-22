package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example2;

// Concrete Handlers
public class LevelOneSupport extends SupportHandler {
    @Override
    public void handleTicket(SupportTicket ticket) {
        if (ticket.getComplexityLevel() <= 1) {
            System.out.println("Level 1 support handled the ticket.");
        } else if (nextHandler != null) {
            nextHandler.handleTicket(ticket);
        }
    }
}
