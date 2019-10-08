package com.efostach.creational.builder;

public class ServiceProvider {
    CloudBuilder builder;

    public void setBuilder(CloudBuilder builder) {
        this.builder = builder;
    }

    Cloud buildCloud() {
        builder.deployCloud();
        builder.buildPrice();
        builder.buildSaas();
        builder.buildStorageCapacity();

        Cloud cloud = builder.getCloud();

        return cloud;
    }
}
