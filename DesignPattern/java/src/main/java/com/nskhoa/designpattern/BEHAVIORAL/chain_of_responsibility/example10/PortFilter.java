package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example10;

public class PortFilter extends PacketFilter {
    @Override
    public void filter(Packet packet) {
        // Pretend to check port (no real port info here, so allow all)
        System.out.println("Port filter passed.");
        if (nextFilter != null) {
            nextFilter.filter(packet);
        }
        else {
            System.out.println("Packet allowed.");
        }
    }
}
