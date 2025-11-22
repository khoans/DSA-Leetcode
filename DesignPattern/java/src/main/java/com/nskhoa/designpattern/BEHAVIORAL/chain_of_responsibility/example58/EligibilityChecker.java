package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example58;

public class EligibilityChecker extends VoteHandler {
    @Override
    public void handle(Vote vote) {
        if (vote.isEligible()) {
            System.out.println("Voter eligible: " + vote.getVoterId());
            if (nextHandler != null) {
                nextHandler.handle(vote);
            }
        }
        else {
            System.out.println("Voter not eligible: " + vote.getVoterId());
        }
    }
}
