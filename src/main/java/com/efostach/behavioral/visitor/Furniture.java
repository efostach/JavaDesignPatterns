package com.efostach.behavioral.visitor;

public class Furniture implements Shop{
    @Override
    public void makePurchase(Client client) {
        client.buy(this);
    }
}
