package com.efostach.structural.facade;

public class Cloud {
    String name;
    int id;

    public Cloud(String instanceName, int instanceId) {
        name = instanceName;
        id = instanceId;
    }

    void deployCloud(String script){
        System.out.println("Deploy " + name + " cloud is started.");
    }

}
