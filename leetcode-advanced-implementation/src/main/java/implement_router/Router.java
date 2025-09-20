package implement_router;

/*
Design a data structure that can efficiently manage data packets in a network router. Each data packet consists of the following attributes:

source: A unique identifier for the machine that generated the packet.
destination: A unique identifier for the target machine.
timestamp: The time at which the packet arrived at the router.
Implement the Router class:

Router(int memoryLimit): Initializes the Router object with a fixed memory limit.

memoryLimit is the maximum number of packets the router can store at any given time.
If adding a new packet would exceed this limit, the oldest packet must be removed to free up space.
bool addPacket(int source, int destination, int timestamp): Adds a packet with the given attributes to the router.

A packet is considered a duplicate if another packet with the same source, destination, and timestamp already exists in the router.
Return true if the packet is successfully added (i.e., it is not a duplicate); otherwise return false.
int[] forwardPacket(): Forwards the next packet in FIFO (First In First Out) order.

Remove the packet from storage.
Return the packet as an array [source, destination, timestamp].
If there are no packets to forward, return an empty array.
int getCount(int destination, int startTime, int endTime):

Returns the number of packets currently stored in the router (i.e., not yet forwarded) that have the specified destination and have timestamps in the inclusive range [startTime, endTime].
Note that queries for addPacket will be made in increasing order of timestamp.



Example 1:

Input:
["Router", "addPacket", "addPacket", "addPacket", "addPacket", "addPacket", "forwardPacket", "addPacket", "getCount"]
[[3], [1, 4, 90], [2, 5, 90], [1, 4, 90], [3, 5, 95], [4, 5, 105], [], [5, 2, 110], [5, 100, 110]]

Output:
[null, true, true, false, true, true, [2, 5, 90], true, 1]

Explanation

Router router = new Router(3); // Initialize Router with memoryLimit of 3.
router.addPacket(1, 4, 90); // Packet is added. Return True.
router.addPacket(2, 5, 90); // Packet is added. Return True.
router.addPacket(1, 4, 90); // This is a duplicate packet. Return False.
router.addPacket(3, 5, 95); // Packet is added. Return True
router.addPacket(4, 5, 105); // Packet is added, [1, 4, 90] is removed as number of packets exceeds memoryLimit. Return True.
router.forwardPacket(); // Return [2, 5, 90] and remove it from router.
router.addPacket(5, 2, 110); // Packet is added. Return True.
router.getCount(5, 100, 110); // The only packet with destination 5 and timestamp in the inclusive range [100, 110] is [4, 5, 105]. Return 1.
Example 2:

Input:
["Router", "addPacket", "forwardPacket", "forwardPacket"]
[[2], [7, 4, 90], [], []]

Output:
[null, true, [7, 4, 90], []]

Explanation

Router router = new Router(2); // Initialize Router with memoryLimit of 2.
router.addPacket(7, 4, 90); // Return True.
router.forwardPacket(); // Return [7, 4, 90].
router.forwardPacket(); // There are no packets left, return [].


Constraints:

2 <= memoryLimit <= 105
1 <= source, destination <= 2 * 105
1 <= timestamp <= 109
1 <= startTime <= endTime <= 109
At most 105 calls will be made to addPacket, forwardPacket, and getCount methods altogether.
queries for addPacket will be made in increasing order of timestamp.
* */

import java.util.*;

/**
 * A network router implementation that efficiently manages packets with memory constraints.
 * This router stores packets in a queue, supports deduplication, and provides efficient
 * time-range queries using binary search and virtual list implementation with start indices.
 */
public class Router {
    /**
     * Represents a network packet with source, destination, and timestamp information.
     */
    static class Packet {
        private final int sourceId;
        private final int destinationId;
        private final int timestamp;

        public Packet(int sourceId, int destinationId, int timestamp) {
            this.sourceId = sourceId;
            this.destinationId = destinationId;
            this.timestamp = timestamp;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Packet)) {
                return false;
            }
            Packet packet = (Packet) object;
            return sourceId == packet.sourceId &&
                   destinationId == packet.destinationId &&
                   timestamp == packet.timestamp;
        }

        @Override
        public int hashCode() {
            return Objects.hash(sourceId, destinationId, timestamp);
        }
    }

    // Number of free slots left in memory
    private int freeSlots;

    // FIFO queue for packet order
    private final Queue<Packet> packetFifoQueue;

    // Set for O(1) duplicate detection
    private final Set<Packet> packetLookupSet;

    // Map: destinationId → list of packets for that destination
    private final Map<Integer, List<Packet>> destinationPacketListMap;

    // Map: destinationId → virtual start index of valid packets
    private final Map<Integer, Integer> destinationStartIndexMap;

    public Router(int memoryLimit) {
        this.freeSlots = memoryLimit;
        this.packetFifoQueue = new LinkedList<>();
        this.packetLookupSet = new HashSet<>();
        this.destinationPacketListMap = new HashMap<>();
        this.destinationStartIndexMap = new HashMap<>();
    }

    public boolean addPacket(int sourceId, int destinationId, int timestamp) {
        Packet incomingPacket = new Packet(sourceId, destinationId, timestamp);

        if (packetLookupSet.contains(incomingPacket)) {
            return false; // duplicate
        }

        if (freeSlots > 0) {
            freeSlots--;
        }
        else {
            Packet evictedPacket = packetFifoQueue.remove();
            packetLookupSet.remove(evictedPacket);

            int evictedDestination = evictedPacket.destinationId;
            int oldStartIndex = destinationStartIndexMap.get(evictedDestination);
            destinationStartIndexMap.put(evictedDestination, oldStartIndex + 1);
        }

        packetFifoQueue.add(incomingPacket);
        packetLookupSet.add(incomingPacket);

        destinationPacketListMap.putIfAbsent(destinationId, new ArrayList<>());
        destinationStartIndexMap.putIfAbsent(destinationId, 0);

        destinationPacketListMap
                .get(destinationId)
                .add(incomingPacket);

        return true;
    }

    public int[] forwardPacket() {
        if (packetFifoQueue.isEmpty()) {
            return new int[]{};
        }

        Packet packetToSend = packetFifoQueue.remove();
        packetLookupSet.remove(packetToSend);

        int destinationId = packetToSend.destinationId;
        List<Packet> packetList = destinationPacketListMap.get(destinationId);

        int updatedStartIndex = destinationStartIndexMap.get(destinationId) + 1;
        destinationStartIndexMap.put(destinationId, updatedStartIndex);

        if (updatedStartIndex >= packetList.size()) {
            destinationPacketListMap.remove(destinationId);
            destinationStartIndexMap.remove(destinationId);
        }

        freeSlots++;

        return new int[]{packetToSend.sourceId, packetToSend.destinationId, packetToSend.timestamp};
    }

    public int getCount(int destinationId, int startTime, int endTime) {
        List<Packet> packetList = destinationPacketListMap.get(destinationId);
        if (packetList == null || packetList.isEmpty()) {
            return 0;
        }

        int startIndex = destinationStartIndexMap.getOrDefault(destinationId, 0);

        int lowerBound = findLowerBoundIndex(packetList, startTime, startIndex);
        int upperBound = findUpperBoundIndex(packetList, endTime, startIndex);

        return upperBound - lowerBound;
    }

    private int findLowerBoundIndex(List<Packet> packetList, int time, int startIndex) {
        int left = startIndex;
        int right = packetList.size();

        while (left < right) {
            int mid = (left + right) / 2;
            if (packetList.get(mid).timestamp >= time) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }

        return left;
    }

    private int findUpperBoundIndex(List<Packet> packetList, int time, int startIndex) {
        int left = startIndex;
        int right = packetList.size();

        while (left < right) {
            int mid = (left + right) / 2;
            if (packetList.get(mid).timestamp > time) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }

        return left;
    }

}
