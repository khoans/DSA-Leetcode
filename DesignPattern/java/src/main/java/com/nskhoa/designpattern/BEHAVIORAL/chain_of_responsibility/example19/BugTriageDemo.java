package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example19;

// Client runner
public class BugTriageDemo {
    public static void main(String[] args) {
        BugTriager junior = new JuniorTriager();
        BugTriager senior = new SeniorTriager();
        BugTriager lead = new LeadTriager();

        junior.setNextTriager(senior);
        senior.setNextTriager(lead);

        BugReport b1 = new BugReport("low");
        BugReport b2 = new BugReport("medium");
        BugReport b3 = new BugReport("high");

        junior.triage(b1);
        junior.triage(b2);
        junior.triage(b3);
    }
}

