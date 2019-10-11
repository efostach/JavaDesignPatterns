package com.efostach.structural.proxy;

public class ProxyCloud implements Cloud {
    private String script;
    private PrivateCloud cloud;

    ProxyCloud(String script) {
        this.script = script;
    }

    @Override
    public void deployCloud() {
        if (cloud == null) {
            cloud = new PrivateCloud(script);
        }
        cloud.deployCloud();
    }
}
