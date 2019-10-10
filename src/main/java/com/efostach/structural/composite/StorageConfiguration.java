package com.efostach.structural.composite;

public class StorageConfiguration implements CloudConfiguration {
    @Override
    public void addConfigurationParameters() {
        System.out.println("Storage config is added");
    }
}
