package com.efostach.structural.bridge;

public class AmazonServiceProvider extends ServiceProvider {

    protected AmazonServiceProvider(Cloud cloud) {
        super(cloud);
    }

    @Override
    public void instantiateResources() {
        System.out.println("Instantiation VM by Amazon provider is started...");
        cloud.deployCloud();
    }
}
