package com.efostach.structural.bridge;

public class PublicCloud implements Cloud {
    @Override
    public void deployCloud() {
        System.out.println("Deploy Public Cloud");
    }
}
