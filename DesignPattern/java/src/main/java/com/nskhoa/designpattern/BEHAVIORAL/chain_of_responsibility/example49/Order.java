package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example49;

public class Order {
    private String id;
    private boolean inventoryManaged;
    private boolean supplierCoordinated;
    private boolean shipmentTracked;

    public Order(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setInventoryManaged(boolean val) {
        inventoryManaged = val;
    }

    public void setSupplierCoordinated(boolean val) {
        supplierCoordinated = val;
    }

    public void setShipmentTracked(boolean val) {
        shipmentTracked = val;
    }
}
