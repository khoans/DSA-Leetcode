package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example36;

// Abstract Handler
public abstract class ContentModerator {
    protected ContentModerator nextModerator;

    public void setNextModerator(ContentModerator nextModerator) {
        this.nextModerator = nextModerator;
    }

    public abstract void moderate(UserContent content);
}
