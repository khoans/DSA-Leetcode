package com.nskhoa.designpattern.creational.factory_method.example6.factory.casual;

import com.nskhoa.designpattern.creational.factory_method.example6.factory.ClothingStore;
import com.nskhoa.designpattern.creational.factory_method.example6.factory.Style;

public class CasualStyle extends ClothingStore {
    public Style createStyle() {
        return new Casual();
    }
}
