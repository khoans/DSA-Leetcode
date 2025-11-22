package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example38;

public class DeviceCapabilityAdjuster extends QualityAdjuster {
    @Override
    public void adjust(StreamRequest request) {
        if ("low-end".equalsIgnoreCase(request.getDeviceCapability())) {
            request.setQuality("Medium");
            System.out.println("Device capability low: setting quality to Medium");
        }
        else if (nextAdjuster != null) {
            nextAdjuster.adjust(request);
        }
    }
}
