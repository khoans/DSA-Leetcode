package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example10;

// Client runner
public class PacketFilteringDemo {
    public static void main(String[] args) {
        PacketFilter blacklistFilter = new IPBlacklistFilter();
        PacketFilter portFilter = new PortFilter();
        PacketFilter contentFilter = new ContentFilter();

        blacklistFilter.setNextFilter(portFilter);
        portFilter.setNextFilter(contentFilter);

        Packet goodPacket = new Packet("192.168.1.10", "10.0.0.1");
        Packet badPacket = new Packet("192.168.1.100", "10.0.0.1");

        System.out.println("Filtering good packet:");
        blacklistFilter.filter(goodPacket);

        System.out.println("\nFiltering bad packet:");
        blacklistFilter.filter(badPacket);
    }
}

