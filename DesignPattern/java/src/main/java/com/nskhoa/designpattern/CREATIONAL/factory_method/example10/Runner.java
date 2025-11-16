package com.nskhoa.designpattern.CREATIONAL.factory_method.example10;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example10.factory.Product;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example10.factory.ProductFactory;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example10.factory.clothing.ClothingProductFactory;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example10.factory.electronic.ElectronicsProductFactory;

public class Runner {
    public static void main(String[] args) {
        ProductFactory clothingProductFactory = new ClothingProductFactory();
        Product clothingProduct = clothingProductFactory.createProduct();
        clothingProduct.getType();

        ProductFactory electronicsProductFactory = new ElectronicsProductFactory();
        Product electronicsProduct = electronicsProductFactory.createProduct();
        electronicsProduct.getType();
    }
}
