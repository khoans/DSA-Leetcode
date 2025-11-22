package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example2;

public class LevelThreeSupport extends SupportHandler {
    @Override
    public void handleTicket(SupportTicket ticket) {
        if (ticket.getComplexityLevel() <= 3) {
            System.out.println("Level 3 support handled the ticket.");
        } else {
            System.out.println("Ticket requires higher-level support beyond Level 3.");
        }
    }
}
