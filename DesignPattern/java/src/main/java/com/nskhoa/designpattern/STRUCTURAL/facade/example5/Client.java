package com.nskhoa.designpattern.STRUCTURAL.facade.example5;

class ProductCatalog {
    void displayProducts() { System.out.println("Displaying products"); }
}

class PaymentProcessing {
    void processPayment() { System.out.println("Processing payment"); }
}

class ShippingService {
    void shipOrder() { System.out.println("Shipping order"); }
}

class ECommerceFacade {
    private ProductCatalog catalog = new ProductCatalog();
    private PaymentProcessing payment = new PaymentProcessing();
    private ShippingService shipping = new ShippingService();

    void placeOrder() {
        catalog.displayProducts();
        payment.processPayment();
        shipping.shipOrder();
        System.out.println("Order placed successfully!");
    }
}

public class Client {
    public static void main(String[] args) {
        ECommerceFacade facade = new ECommerceFacade();
        facade.placeOrder();
    }
}
