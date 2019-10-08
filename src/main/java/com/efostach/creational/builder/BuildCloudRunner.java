package com.efostach.creational.builder;

public class BuildCloudRunner {
    public static void main(String[] args) {
        ServiceProvider sp = new ServiceProvider();
        sp.setBuilder(new SlackCloudDeploymentBuilder());
        Cloud cloud = sp.buildCloud();

        System.out.println(cloud);
    }
}
