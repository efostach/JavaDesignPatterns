package com.efostach.creational.builder;

public abstract class CloudBuilder {

    Cloud cloud;

    void deployCloud() {
        cloud = new Cloud();
    }

    abstract void buildStorageCapacity();

    abstract void buildSaas();

    abstract void buildPrice();

    Cloud getCloud() {
        return cloud;
    }

}
