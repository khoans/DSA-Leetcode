package com.nskhoa.designpattern.CREATIONAL.factory_method.example6.factory.formal;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example6.factory.ClothingStore;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example6.factory.Style;

public class FormalStyle extends ClothingStore {
    public Style createStyle() {
        return new Formal();
    }
}
