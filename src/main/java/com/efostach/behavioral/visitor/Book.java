package com.efostach.behavioral.visitor;

public class Book implements Shop{
    @Override
    public void makePurchase(Client client) {
        client.buy(this);
    }
}
