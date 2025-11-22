package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example38;

// Request class
public class StreamRequest {
    private int networkSpeedMbps;
    private String deviceCapability;
    private String quality;

    public StreamRequest(int networkSpeedMbps, String deviceCapability) {
        this.networkSpeedMbps = networkSpeedMbps;
        this.deviceCapability = deviceCapability;
    }

    public int getNetworkSpeedMbps() {
        return networkSpeedMbps;
    }

    public String getDeviceCapability() {
        return deviceCapability;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getQuality() {
        return quality;
    }
}
