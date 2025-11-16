package com.nskhoa.designpattern.creational.factory_method.example1.factory.salty_restaurant;

import com.nskhoa.designpattern.creational.factory_method.example1.factory.Dish;
import com.nskhoa.designpattern.creational.factory_method.example1.factory.Restaurant;

public class SaltyRestaurant extends Restaurant {
    public Dish createDish() {
        return new SaltyDish();
    }
}
