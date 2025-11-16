package com.nskhoa.designpattern.creational.builder.example1;

public class Meal {
    private String main;
    private String side;
    private String drink;

    private Meal(Builder builder) {
        this.main = builder.main; this.side = builder.side; this.drink = builder.drink;
    }

    public static class Builder {
        private String main;
        private String side;
        private String drink;

        public Builder main(String main) {
            this.main = main; return this;
        }

        public Builder side(String side) {
            this.side = side; return this;
        }

        public Builder drink(String drink) {
            this.drink = drink; return this;
        }

        public Meal build() {
            return new Meal(this);
        }
    }

    public String toString() {
        return main + ", " + side + ", " + drink;
    }

    public static void main(String[] args) {
        Meal meal = new Meal.Builder()
                .main("Steak")
                .side("Fries")
                .drink("Cola")
                .build();
        System.out.println(meal);
    }
}
