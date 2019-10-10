package com.efostach.structural.bridge;

public class CloudCreator {
    public static void main(String[] args) {
        ServiceProvider[] providers = {
                new OpenStackServiceProvicder(new PrivateCloud()),
                new AmazonServiceProvider(new PublicCloud())
        };

        for (ServiceProvider sp : providers) {
            sp.instantiateResources();
        }

    }
}
