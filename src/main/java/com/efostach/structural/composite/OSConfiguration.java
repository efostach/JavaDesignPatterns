package com.efostach.structural.composite;

public class OSConfiguration implements CloudConfiguration {
    @Override
    public void addConfigurationParameters() {
        System.out.println("OS config is added");
    }
}