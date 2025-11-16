package com.nskhoa.designpattern.CREATIONAL.prototype.example8;

import java.util.ArrayList;
import java.util.List;

public class InventoryProcess implements Cloneable {
    private String type;
    private List<String> steps = new ArrayList<>();

    public InventoryProcess(String type) {
        this.type = type;
    }

    public void addStep(String step) {
        steps.add(step);
    }

    public InventoryProcess clone() {
        try {
            InventoryProcess cloned = (InventoryProcess) super.clone(); cloned.steps = new ArrayList<>(steps);
            return cloned;
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        InventoryProcess warehouseProcess = new InventoryProcess("Warehouse");
        warehouseProcess.addStep("Receive Goods");
        warehouseProcess.addStep("Store Goods");
        warehouseProcess.addStep("Pick Goods");

        InventoryProcess clonedProcess = warehouseProcess.clone();
        clonedProcess.addStep("Ship Goods");

        System.out.println("Warehouse Process Steps: " + warehouseProcess.steps);
        System.out.println("Cloned Process Steps: " + clonedProcess.steps);
    }
}
