package com.efostach.structural.decorator;

public class CloudDecorator implements Cloud {

    Cloud cloud;

    CloudDecorator(Cloud cloud) {
        this.cloud = cloud;
    }

    @Override
    public String createCloud() {
        return cloud.createCloud();
    }
}
