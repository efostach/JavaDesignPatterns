package com.efostach.behavioral.visitor;

public class AppRunner {
    public static void main(String[] args) {
        ShoppingMall shoppingMall = new ShoppingMall();

        Client person = new PersonClient();
        Client business = new BuisinessClient();

        System.out.println("Person:");
        shoppingMall.makePurchase(person);

        System.out.println("\n=============================\n");

        System.out.println("Business:");
        shoppingMall.makePurchase(business);

    }
}
