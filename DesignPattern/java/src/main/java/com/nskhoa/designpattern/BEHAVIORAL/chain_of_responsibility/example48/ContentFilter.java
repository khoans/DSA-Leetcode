package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example48;

public class ContentFilter extends RecommendationHandler {
    @Override
    public void recommend(UserInteraction interaction) {
        System.out.println("Filtering content: " + interaction.getContent());
        if (nextHandler != null) {
            nextHandler.recommend(interaction);
        }
    }
}
