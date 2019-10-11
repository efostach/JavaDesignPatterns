package com.efostach.structural.proxy;

public class AppRunner {
    public static void main(String[] args) {
        Cloud cloud = new ProxyCloud("Ansible script");
        cloud.deployCloud();

    }
}
