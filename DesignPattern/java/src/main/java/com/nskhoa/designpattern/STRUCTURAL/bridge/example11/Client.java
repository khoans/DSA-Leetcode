package com.nskhoa.designpattern.STRUCTURAL.bridge.example11;

public class Client {
    public static void main(String[] args) {
        ECommerceClient mobileShopifyUI = new MobileECommerceClient(new ShopifyProductSystem());
        mobileShopifyUI.showProducts();

        ECommerceClient webWooCommerceUI = new WebECommerceClient(new WooCommerceProductSystem());
        webWooCommerceUI.showProducts();

        ECommerceClient desktopShopifyUI = new DesktopECommerceClient(new ShopifyProductSystem());
        desktopShopifyUI.showProducts();
    }
}
