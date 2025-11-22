package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example58;

public class VoteTallyer extends VoteHandler {
    @Override
    public void handle(Vote vote) {
        if (vote.recorded) {
            System.out.println("Tallying vote for: " + vote.getVoterId());
            vote.setTallied(true);
        }
    }
}

