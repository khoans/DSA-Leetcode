package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example7;

// Client Runner
public class OrderValidationDemo {
    public static void main(String[] args) {
        OrderValidator addressValidator = new AddressValidator();
        OrderValidator paymentValidator = new PaymentValidator();
        OrderValidator inventoryValidator = new InventoryValidator();

        addressValidator.setNextValidator(paymentValidator);
        paymentValidator.setNextValidator(inventoryValidator);

        Order order = new Order("ORD12345");
        addressValidator.validate(order);
    }
}
