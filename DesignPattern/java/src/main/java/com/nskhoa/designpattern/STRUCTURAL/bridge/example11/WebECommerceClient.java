package com.nskhoa.designpattern.STRUCTURAL.bridge.example11;

public class WebECommerceClient extends ECommerceClient {
    public WebECommerceClient(ProductSystem productSystem) { super(productSystem); }
    public void showProducts() {
        System.out.print("Web UI: ");
        productSystem.displayProducts();
    }
}
