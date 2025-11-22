package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example38;

// Concrete Handlers
public class NetworkSpeedAdjuster extends QualityAdjuster {
    @Override
    public void adjust(StreamRequest request) {
        if (request.getNetworkSpeedMbps() < 5) {
            request.setQuality("Low");
            System.out.println("Network speed low: setting quality to Low");
        }
        else if (nextAdjuster != null) {
            nextAdjuster.adjust(request);
        }
    }
}
