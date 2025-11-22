package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example48;

public class ContentRecommendationDemo {
    public static void main(String[] args) {
        RecommendationHandler behavior = new BehaviorAnalyzer();
        RecommendationHandler filter = new ContentFilter();
        RecommendationHandler generator = new RecommendationGenerator();

        behavior.setNextHandler(filter);
        filter.setNextHandler(generator);

        UserInteraction interaction = new UserInteraction("clicked", "video content");
        behavior.recommend(interaction);
    }
}
