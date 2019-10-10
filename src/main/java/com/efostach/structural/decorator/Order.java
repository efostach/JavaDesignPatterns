package com.efostach.structural.decorator;

public class Order {
    public static void main(String[] args) {
        Cloud cloud = new PublicCloud(new PrivateCloud());
        System.out.println(cloud.createCloud());
    }
}