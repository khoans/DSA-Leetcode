package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example58;

public class OnlineVotingDemo {
    public static void main(String[] args) {
        VoteHandler eligibility = new EligibilityChecker();
        VoteHandler recorder = new VoteRecorder();
        VoteHandler tallyer = new VoteTallyer();

        eligibility.setNextHandler(recorder);
        recorder.setNextHandler(tallyer);

        Vote vote = new Vote("Voter123", true);
        eligibility.handle(vote);
    }
}
