package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example10;

public class Runner {
    public static void main(String[] args) {
        AccessoryFactory smallFactory = new SmallSizeFactory();
        Helmet smallHelmet = smallFactory.createHelmet();
        Glove smallGlove = smallFactory.createGlove();
        System.out.println("Small Helmet Size: " + smallHelmet.getSize());
        System.out.println("Small Glove Size: " + smallGlove.getSize());

        AccessoryFactory largeFactory = new LargeSizeFactory();
        Helmet largeHelmet = largeFactory.createHelmet();
        Glove largeGlove = largeFactory.createGlove();
        System.out.println("Large Helmet Size: " + largeHelmet.getSize());
        System.out.println("Large Glove Size: " + largeGlove.getSize());
    }
}
