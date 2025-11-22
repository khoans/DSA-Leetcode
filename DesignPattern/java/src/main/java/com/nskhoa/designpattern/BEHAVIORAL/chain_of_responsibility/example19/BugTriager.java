package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example19;

// Abstract Handler
public abstract class BugTriager {
    protected BugTriager nextTriager;

    public void setNextTriager(BugTriager nextTriager) {
        this.nextTriager = nextTriager;
    }

    public abstract void triage(BugReport bug);
}
