package com.efostach.creational.builder;

public class SlackCloudDeploymentBuilder extends CloudBuilder {

    @Override
    void buildStorageCapacity() {
        cloud.setStorageCapacity(30);
    }

    @Override
    void buildSaas() {
        cloud.setSaaS(SaaS.SLACK);
    }

    @Override
    void buildPrice() {
        cloud.setPrice(100);
    }
}
