package com.nskhoa.designpattern.CREATIONAL.factory_method.example1.factory.sweet_restaurant;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example1.factory.Dish;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example1.factory.Restaurant;

public class SweetRestaurant extends Restaurant {
    public Dish createDish() {
        return new SweetDish();
    }
}
