package com.efostach.structural.facade;

public class CloudConfiguration {
    String script;

    public CloudConfiguration(String config) {
        script = config;
    }

    void aploadConfig(Cloud instance) {
        instance.deployCloud(script);
    }
}
