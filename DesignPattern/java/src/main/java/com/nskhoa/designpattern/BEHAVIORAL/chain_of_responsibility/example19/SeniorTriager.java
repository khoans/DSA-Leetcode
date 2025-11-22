package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example19;

public class SeniorTriager extends BugTriager {
    @Override
    public void triage(BugReport bug) {
        if ("medium".equals(bug.getSeverity())) {
            System.out.println("Senior triager assigned medium severity bug.");
        }
        else if (nextTriager != null) {
            nextTriager.triage(bug);
        }
    }
}
