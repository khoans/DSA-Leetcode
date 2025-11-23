package com.nskhoa.designpattern.BEHAVIORAL.iterator.example25;

public class RecipeStepDemo {
    public static void main(String[] args) {
        Recipe recipe = new Recipe();
        recipe.addStep(new RecipeStep("Mix ingredients"));
        recipe.addStep(new RecipeStep("Bake at 180C for 45 mins"));

        MyIterator<RecipeStep> it = recipe.createIterator();
        while (it.hasNext()) {
            RecipeStep step = it.next();
            System.out.println(step.getDescription());
        }
    }
}

