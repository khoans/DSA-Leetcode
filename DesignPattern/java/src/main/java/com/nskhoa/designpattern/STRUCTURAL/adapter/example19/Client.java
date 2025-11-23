package com.nskhoa.designpattern.STRUCTURAL.adapter.example19;

public class Client {
    private ECommercePlatform platform;

    public Client(ECommercePlatform platform) {
        this.platform = platform;
    }

    public void listProduct(String product) {
        platform.listProduct(product);
    }

    public static void main(String[] args) {
        ECommercePlatform shopifyAdapter = new ShopifyAdapter();
        Client shopifyClient = new Client(shopifyAdapter);
        shopifyClient.listProduct("Laptop");

        ECommercePlatform wooAdapter = new WooCommerceAdapter();
        Client wooClient = new Client(wooAdapter);
        wooClient.listProduct("Smartphone");
    }
}
