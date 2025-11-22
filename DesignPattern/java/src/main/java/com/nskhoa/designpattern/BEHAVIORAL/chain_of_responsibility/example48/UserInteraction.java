package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example48;

public class UserInteraction {
    private String behavior;
    private String content;

    public UserInteraction(String behavior, String content) {
        this.behavior = behavior;
        this.content = content;
    }

    public String getBehavior() {
        return behavior;
    }

    public String getContent() {
        return content;
    }
}
