package com.efostach.structural.composite;

public class HardwareConfiguration implements CloudConfiguration{
    @Override
    public void addConfigurationParameters() {
        System.out.println("Hardware config is added");
    }
}
