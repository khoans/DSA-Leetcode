package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example49;

public class SupplyChainManagementDemo {
    public static void main(String[] args) {
        SupplyChainHandler inventory = new InventoryManager();
        SupplyChainHandler supplier = new SupplierCoordinator();
        SupplyChainHandler shipment = new ShipmentTracker();

        inventory.setNextHandler(supplier);
        supplier.setNextHandler(shipment);

        Order order = new Order("ORD2025");
        inventory.handle(order);
    }
}

