package com.efostach.structural.proxy;

public class PrivateCloud implements Cloud {

    private String script;

    public PrivateCloud(String script) {
        this.script = script;
        uploadConfig();
    }

    @Override
    public void deployCloud() {
        System.out.println("Deploy cloud is started...");
    }

    private void uploadConfig() {
        System.out.println("Upload configuration is started...");
    }
}
