package com.efostach.structural.composite;

public class CloudCreator {
    public static void main(String[] args) {
        Provider provider = new Provider();

        CloudConfiguration networking = new NetworkingConfiguration();
        CloudConfiguration hardware = new HardwareConfiguration();
        CloudConfiguration storage= new StorageConfiguration();
        CloudConfiguration os = new OSConfiguration();

        provider.aploadConfiguration(networking);
        provider.aploadConfiguration(hardware);
        provider.aploadConfiguration(storage);
        provider.aploadConfiguration(os);

        provider.deployCloud();
    }
}