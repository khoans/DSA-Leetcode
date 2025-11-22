package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example50;

public class DeliveryScheduler extends MarketingHandler {
    @Override
    public void process(Campaign campaign) {
        System.out.println("Scheduling delivery of: " + campaign.getPersonalizedMessage());
        campaign.setDeliveryScheduled(true);
    }
}
