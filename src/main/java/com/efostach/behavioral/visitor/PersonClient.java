package com.efostach.behavioral.visitor;

public class PersonClient implements Client{
    @Override
    public void buy(Book book) {
        System.out.println("Buy fantasy book.");
    }

    @Override
    public void buy(Furniture furniture) {
        System.out.println("Buy chair.");
    }
}
