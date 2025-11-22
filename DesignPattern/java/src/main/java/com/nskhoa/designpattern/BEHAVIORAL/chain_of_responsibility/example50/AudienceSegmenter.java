package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example50;

public class AudienceSegmenter extends MarketingHandler {
    @Override
    public void process(Campaign campaign) {
        System.out.println("Segmenting audience: " + campaign.getAudienceSegment());
        if (nextHandler != null) {
            nextHandler.process(campaign);
        }
    }
}
