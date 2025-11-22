package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example19;

// Concrete Handlers
public class JuniorTriager extends BugTriager {
    @Override
    public void triage(BugReport bug) {
        if ("low".equals(bug.getSeverity())) {
            System.out.println("Junior triager assigned low severity bug.");
        }
        else if (nextTriager != null) {
            nextTriager.triage(bug);
        }
    }
}
