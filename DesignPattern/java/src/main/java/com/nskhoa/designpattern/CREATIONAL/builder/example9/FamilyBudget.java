package com.nskhoa.designpattern.CREATIONAL.builder.example9;

public class FamilyBudget {
    private double food;
    private double entertainment;
    private double savings;

    private FamilyBudget(Builder builder) {
        this.food = builder.food; this.entertainment = builder.entertainment; this.savings = builder.savings;
    }

    public static class Builder {
        private double food;
        private double entertainment;
        private double savings;

        public Builder food(double f) {
            this.food = f; return this;
        }

        public Builder entertainment(double e) {
            this.entertainment = e; return this;
        }

        public Builder savings(double s) {
            this.savings = s; return this;
        }

        public FamilyBudget build() {
            return new FamilyBudget(this);
        }
    }

    public static void main(String[] args) {
        FamilyBudget budget = new FamilyBudget.Builder()
                .food(500)
                .entertainment(200)
                .savings(300)
                .build();

        System.out.println("Family Budget:");
        System.out.println("Food: $" + budget.food);
        System.out.println("Entertainment: $" + budget.entertainment);
        System.out.println("Savings: $" + budget.savings);
    }
}
