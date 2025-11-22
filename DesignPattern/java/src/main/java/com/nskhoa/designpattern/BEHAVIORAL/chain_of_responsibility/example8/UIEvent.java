package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example8;

// Request class
public class UIEvent {
    private String type;
    private String targetName;

    public UIEvent(String type, String targetName) {
        this.type = type;
        this.targetName = targetName;
    }

    public String getType() {
        return type;
    }

    public String getTargetName() {
        return targetName;
    }
}
