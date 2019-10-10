package com.efostach.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Provider {
    private List<CloudConfiguration> configList = new ArrayList<>();

    public void aploadConfiguration(CloudConfiguration config) {
        configList.add(config);
    }

    void deployCloud(){
        for (CloudConfiguration config : configList) {
            config.addConfigurationParameters();
        }
    }


}
