package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example48;

public class BehaviorAnalyzer extends RecommendationHandler {
    @Override
    public void recommend(UserInteraction interaction) {
        System.out.println("Analyzing behavior: " + interaction.getBehavior());
        if (nextHandler != null) {
            nextHandler.recommend(interaction);
        }
    }
}
