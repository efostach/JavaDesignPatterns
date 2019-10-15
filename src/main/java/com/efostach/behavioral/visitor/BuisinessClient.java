package com.efostach.behavioral.visitor;

public class BuisinessClient implements Client{
    @Override
    public void buy(Book book) {
        System.out.println("Buy technical and business books to the office library.");
    }

    @Override
    public void buy(Furniture furniture) {
        System.out.println("Buy furniture to the office.");
    }
}
