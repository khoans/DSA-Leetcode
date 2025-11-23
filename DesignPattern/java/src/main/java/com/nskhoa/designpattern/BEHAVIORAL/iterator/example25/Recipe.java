package com.nskhoa.designpattern.BEHAVIORAL.iterator.example25;

public class Recipe {
    private final RecipeStep[] steps = new RecipeStep[10];
    private int count = 0;

    void addStep(RecipeStep step) { if (count < steps.length) steps[count++] = step; }

    MyIterator<RecipeStep> createIterator() { return new RecipeStepIterator(); }

    private class RecipeStepIterator implements MyIterator<RecipeStep> {
        int index = 0;
        public boolean hasNext() { return index < count; }
        public RecipeStep next() { return steps[index++]; }
    }
}
