package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example29;

public class PolicyEnforcement extends ModerationHandler {
    @Override
    public void moderate(ChatMessage message) {
        System.out.println("PolicyEnforcement: Message approved.");
    }
}
