package com.efostach.behavioral.template;

public class AppRunner {
    public static void main(String[] args) {
        CloudTemplate publicCloud = new PublicCloud();
        CloudTemplate privateCloud = new PrivateCloud();

        publicCloud.createCloud();
        System.out.println("\n===================================\n");
        privateCloud.createCloud();

    }
}
