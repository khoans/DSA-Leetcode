package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example19;

public class LeadTriager extends BugTriager {
    @Override
    public void triage(BugReport bug) {
        System.out.println("Lead triager assigned high severity bug.");
    }
}
