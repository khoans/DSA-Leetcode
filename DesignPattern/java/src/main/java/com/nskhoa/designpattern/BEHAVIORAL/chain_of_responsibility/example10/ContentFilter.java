package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example10;

public class ContentFilter extends PacketFilter {
    @Override
    public void filter(Packet packet) {
        System.out.println("Content filter passed.");
        if (nextFilter != null) {
            nextFilter.filter(packet);
        }
        else {
            System.out.println("Packet allowed.");
        }
    }
}
