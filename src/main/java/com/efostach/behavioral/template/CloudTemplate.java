package com.efostach.behavioral.template;

public abstract class CloudTemplate {
    void createCloud() {
        System.out.println("1. Allocate resources");
        System.out.println("2. Instantiate VM");
        uploadConfiguration();
        System.out.println("4. Deploy cloud configuration");
    }

    abstract void uploadConfiguration();
}
