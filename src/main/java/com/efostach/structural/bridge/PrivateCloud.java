package com.efostach.structural.bridge;

public class PrivateCloud implements Cloud {
    @Override
    public void deployCloud() {
        System.out.println("Deploy Private Cloud");
    }
}
