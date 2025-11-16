package com.nskhoa.designpattern.creational.factory_method.example6;

import com.nskhoa.designpattern.creational.factory_method.example6.factory.ClothingStore;
import com.nskhoa.designpattern.creational.factory_method.example6.factory.Style;
import com.nskhoa.designpattern.creational.factory_method.example6.factory.casual.CasualStyle;
import com.nskhoa.designpattern.creational.factory_method.example6.factory.formal.FormalStyle;

public class Runner {
    public static void main(String[] args) {
        ClothingStore casualStore = new CasualStyle();
        Style style = casualStore.createStyle();
        style.getType();

        ClothingStore formalStore = new FormalStyle();
        Style formalStyle = formalStore.createStyle();
        formalStyle.getType();
    }
}
