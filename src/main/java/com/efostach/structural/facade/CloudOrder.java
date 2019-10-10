package com.efostach.structural.facade;

public class CloudOrder {

    Boolean isExecuted;

    public CloudOrder() {
        isExecuted = false;
    }

    void startOrderExecution() {
        System.out.println("Order is started.");
    }
    void completeOrderExecution() {
        isExecuted = false;
        System.out.println("Order is completed.");
    }
}
