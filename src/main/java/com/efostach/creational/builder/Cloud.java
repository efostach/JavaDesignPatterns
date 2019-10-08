package com.efostach.creational.builder;

public class Cloud {
    private int storageCapacity;
    private SaaS SaaS;
    private int price;

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void setSaaS(SaaS SaaS) {
        this.SaaS = SaaS;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cloud{" +
                "storageCapacity=" + storageCapacity +
                ", SaaS='" + SaaS + '\'' +
                ", price=" + price +
                '}';
    }
}


