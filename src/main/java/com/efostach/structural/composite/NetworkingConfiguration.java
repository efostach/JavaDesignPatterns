package com.efostach.structural.composite;

public class NetworkingConfiguration implements CloudConfiguration {
    @Override
    public void addConfigurationParameters() {
        System.out.println("Network config is added");
    }
}
