package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example38;

// Client runner
public class VideoQualityAdjustmentDemo {
    public static void main(String[] args) {
        QualityAdjuster networkAdjuster = new NetworkSpeedAdjuster();
        QualityAdjuster deviceAdjuster = new DeviceCapabilityAdjuster();
        QualityAdjuster defaultAdjuster = new DefaultQualityAdjuster();

        networkAdjuster.setNextAdjuster(deviceAdjuster);
        deviceAdjuster.setNextAdjuster(defaultAdjuster);

        StreamRequest r1 = new StreamRequest(3, "high-end");
        StreamRequest r2 = new StreamRequest(10, "low-end");
        StreamRequest r3 = new StreamRequest(10, "high-end");

        networkAdjuster.adjust(r1);
        System.out.println("Quality set to: " + r1.getQuality() + "\n");

        networkAdjuster.adjust(r2);
        System.out.println("Quality set to: " + r2.getQuality() + "\n");

        networkAdjuster.adjust(r3);
        System.out.println("Quality set to: " + r3.getQuality() + "\n");
    }
}

