package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example10;

// Concrete Handlers
public class IPBlacklistFilter extends PacketFilter {
    @Override
    public void filter(Packet packet) {
        // Simple example blacklisted IP
        if ("192.168.1.100".equals(packet.getSourceIp())) {
            System.out.println("Packet from blacklisted IP blocked.");
        }
        else if (nextFilter != null) {
            nextFilter.filter(packet);
        }
        else {
            System.out.println("Packet allowed.");
        }
    }
}
