package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example4;

// Abstract Handler
public abstract class SpamFilter {
    protected SpamFilter nextFilter;

    public void setNextFilter(SpamFilter nextFilter) {
        this.nextFilter = nextFilter;
    }

    public abstract void filterEmail(Email email);
}
