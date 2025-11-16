package com.nskhoa.designpattern.creational.prototype.example1;

import java.util.ArrayList;
import java.util.List;

public class Recipe implements Cloneable {
    private String name;
    private List<String> ingredients = new ArrayList<>();

    public Recipe(String name) {
        this.name = name;
    }

    public void addIngredient(String ing) {
        ingredients.add(ing);
    }

    public Recipe clone() {
        try {
            Recipe cloned = (Recipe) super.clone(); cloned.ingredients = new ArrayList<>(ingredients); return cloned;
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public String toString() {
        return name + ": " + ingredients;
    }

    public static void main(String[] args) {
        Recipe pancakeRecipe = new Recipe("Pancake");
        pancakeRecipe.addIngredient("Flour");
        pancakeRecipe.addIngredient("Eggs");
        pancakeRecipe.addIngredient("Milk");

        Recipe clonedRecipe = pancakeRecipe.clone();
        clonedRecipe.addIngredient("Chocolate Chips");

        System.out.println(pancakeRecipe);
        System.out.println(clonedRecipe);
    }
}
