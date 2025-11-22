package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example58;

public class Vote {
    private String voterId;
    private boolean eligible;
    boolean recorded;
    private boolean tallied;

    public Vote(String voterId, boolean eligible) {
        this.voterId = voterId;
        this.eligible = eligible;
    }

    public String getVoterId() {
        return voterId;
    }

    public boolean isEligible() {
        return eligible;
    }

    public void setRecorded(boolean val) {
        recorded = val;
    }

    public void setTallied(boolean val) {
        tallied = val;
    }
}
