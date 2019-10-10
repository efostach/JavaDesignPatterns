package com.efostach.structural.bridge;

public class OpenStackServiceProvicder extends ServiceProvider {

    protected OpenStackServiceProvicder(Cloud cloud) {
        super(cloud);
    }

    @Override
    public void instantiateResources() {
        System.out.println("Instantiation VM by OpenStack provider is started...");
        cloud.deployCloud();
    }
}
