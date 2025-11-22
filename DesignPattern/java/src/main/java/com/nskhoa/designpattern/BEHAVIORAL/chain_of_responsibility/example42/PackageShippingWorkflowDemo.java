package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example42;

public class PackageShippingWorkflowDemo {
    public static void main(String[] args) {
        ShippingHandler addressValidator = new AddressValidator();
        ShippingHandler costCalculator = new ShippingCostCalculator();
        ShippingHandler pickupScheduler = new PickupScheduler();

        addressValidator.setNextHandler(costCalculator); costCalculator.setNextHandler(pickupScheduler);

        ShippingRequest request = new ShippingRequest("123 Main Street", 15.5); addressValidator.handle(request);
    }
}
