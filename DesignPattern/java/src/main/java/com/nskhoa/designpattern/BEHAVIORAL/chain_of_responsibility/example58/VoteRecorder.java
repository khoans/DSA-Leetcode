package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example58;

public class VoteRecorder extends VoteHandler {
    @Override
    public void handle(Vote vote) {
        System.out.println("Recording vote for: " + vote.getVoterId());
        vote.setRecorded(true);
        if (nextHandler != null) {
            nextHandler.handle(vote);
        }
    }
}
