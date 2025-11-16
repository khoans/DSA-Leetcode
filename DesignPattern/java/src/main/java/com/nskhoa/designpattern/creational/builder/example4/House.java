package com.nskhoa.designpattern.CREATIONAL.builder.example4;

public class House {
    private String foundation;
    private String walls;
    private String roof;

    private House(Builder builder) {
        this.foundation = builder.foundation; this.walls = builder.walls; this.roof = builder.roof;
    }

    public static class Builder {
        private String foundation;
        private String walls;
        private String roof;

        public Builder foundation(String f) {
            this.foundation = f; return this;
        }

        public Builder walls(String w) {
            this.walls = w; return this;
        }

        public Builder roof(String r) {
            this.roof = r; return this;
        }

        public House build() {
            return new House(this);
        }
    }

    public static void main(String[] args) {
        House house = new House.Builder()
                .foundation("Concrete")
                .walls("Brick")
                .roof("Tile")
                .build();
        System.out.println("Foundation: " + house.foundation);
        System.out.println("Walls: " + house.walls);
        System.out.println("Roof: " + house.roof);
    }
}
