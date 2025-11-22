package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example52;

public class ResourceRequest {
    private int cpuQuota;
    private int memoryQuota;
    boolean allocated;
    private boolean configured;

    public ResourceRequest(int cpuQuota, int memoryQuota) {
        this.cpuQuota = cpuQuota;
        this.memoryQuota = memoryQuota;
    }

    public int getCpuQuota() {
        return cpuQuota;
    }

    public int getMemoryQuota() {
        return memoryQuota;
    }

    public void setAllocated(boolean val) {
        allocated = val;
    }

    public void setConfigured(boolean val) {
        configured = val;
    }
}
