package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example17;

// Abstract Handler
public abstract class EventListener {
    protected EventListener nextListener;

    public void setNextListener(EventListener nextListener) {
        this.nextListener = nextListener;
    }

    public abstract void onEvent(Event event);
}
