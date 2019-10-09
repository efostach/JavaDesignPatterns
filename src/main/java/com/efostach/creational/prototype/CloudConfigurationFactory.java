package com.efostach.creational.prototype;

public class CloudConfigurationFactory {

    CloudConfiguration config;

    public CloudConfigurationFactory(CloudConfiguration config) {
        this.config = config;
    }

    public void setConfig(CloudConfiguration config) {
        this.config = config;
    }

    CloudConfiguration cloneConfig() {
        return (CloudConfiguration) config.copy();
    }
}
