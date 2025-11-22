package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example39;

// Client runner
public class EcommerceReturnProcessingDemo {
    public static void main(String[] args) {
        ReturnHandler eligibilityChecker = new EligibilityChecker();
        ReturnHandler refundProcessor = new RefundProcessor();
        ReturnHandler inventoryUpdater = new InventoryUpdater();

        eligibilityChecker.setNextHandler(refundProcessor);
        refundProcessor.setNextHandler(inventoryUpdater);

        ReturnRequest r1 = new ReturnRequest("ORD123", true);
        ReturnRequest r2 = new ReturnRequest("ORD124", false);

        System.out.println("Processing return r1:");
        eligibilityChecker.handle(r1);
        System.out.println();

        System.out.println("Processing return r2:");
        eligibilityChecker.handle(r2);
    }
}

