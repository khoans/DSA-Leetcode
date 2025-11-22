package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example50;

public class MarketingCampaignDemo {
    public static void main(String[] args) {
        MarketingHandler segmenter = new AudienceSegmenter();
        MarketingHandler personalizer = new Personalizer();
        MarketingHandler scheduler = new DeliveryScheduler();

        segmenter.setNextHandler(personalizer);
        personalizer.setNextHandler(scheduler);

        Campaign campaign = new Campaign("Young Adults");
        segmenter.process(campaign);
    }
}
