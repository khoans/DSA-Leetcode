package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example28;

public class LockReleaseHandler extends CleanupHandler {
    @Override
    public void cleanup() {
        System.out.println("Releasing locks...");
    }
}
