package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example50;

public class Campaign {
    private String audienceSegment;
    private String personalizedMessage;
    private boolean deliveryScheduled;

    public Campaign(String audienceSegment) {
        this.audienceSegment = audienceSegment;
    }

    public String getAudienceSegment() {
        return audienceSegment;
    }

    public void setPersonalizedMessage(String message) {
        personalizedMessage = message;
    }

    public String getPersonalizedMessage() {
        return personalizedMessage;
    }

    public void setDeliveryScheduled(boolean val) {
        deliveryScheduled = val;
    }
}
