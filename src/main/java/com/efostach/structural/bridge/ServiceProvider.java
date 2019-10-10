package com.efostach.structural.bridge;

public abstract class ServiceProvider {
    protected Cloud cloud;

    protected ServiceProvider(Cloud cloud) {
        this.cloud = cloud;
    }

    public abstract void instantiateResources();
}
