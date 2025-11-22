package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example39;

public class RefundProcessor extends ReturnHandler {
    @Override
    public void handle(ReturnRequest request) {
        System.out.println("Processing refund for order " + request.getOrderId());
        request.setRefundProcessed(true);
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
