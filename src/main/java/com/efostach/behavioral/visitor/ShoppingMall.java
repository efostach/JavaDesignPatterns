package com.efostach.behavioral.visitor;

public class ShoppingMall implements Shop{
    Shop[] shops;

    public ShoppingMall() {
        this.shops = new Shop[]{
                new Book(),
                new Furniture()
        };
    }

    @Override
    public void makePurchase(Client client) {
        for (Shop shop : shops) {
            shop.makePurchase(client);
        }
    }
}
