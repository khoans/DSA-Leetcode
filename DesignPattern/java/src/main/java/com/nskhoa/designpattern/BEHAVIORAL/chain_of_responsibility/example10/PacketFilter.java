package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example10;

// Abstract Handler
public abstract class PacketFilter {
    protected PacketFilter nextFilter;

    public void setNextFilter(PacketFilter nextFilter) {
        this.nextFilter = nextFilter;
    }

    public abstract void filter(Packet packet);
}
