package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example48;

public class RecommendationGenerator extends RecommendationHandler {
    @Override
    public void recommend(UserInteraction interaction) {
        System.out.println("Generating recommendations for content: " + interaction.getContent());
    }
}
