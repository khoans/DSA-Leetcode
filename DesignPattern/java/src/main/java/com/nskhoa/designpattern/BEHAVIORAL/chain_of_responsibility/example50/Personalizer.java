package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example50;

public class Personalizer extends MarketingHandler {
    @Override
    public void process(Campaign campaign) {
        String message = "Personalized message for " + campaign.getAudienceSegment();
        campaign.setPersonalizedMessage(message);
        System.out.println("Personalizing message.");
        if (nextHandler != null) {
            nextHandler.process(campaign);
        }
    }
}
