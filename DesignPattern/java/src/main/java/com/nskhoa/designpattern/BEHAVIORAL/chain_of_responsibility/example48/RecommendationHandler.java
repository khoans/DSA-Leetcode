package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example48;

public abstract class RecommendationHandler {
    protected RecommendationHandler nextHandler;

    public void setNextHandler(RecommendationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void recommend(UserInteraction interaction);
}
