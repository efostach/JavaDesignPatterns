package com.efostach.structural.decorator;

public class PublicCloud extends CloudDecorator implements Cloud {

    public PublicCloud(Cloud cloud) {
        super(cloud);
    }

    @Override
    public String createCloud() {
        return super.createCloud() + "\n" + makePublicURL();
    }

    public String makePublicURL() {
        return "Make public URL";
    }

}