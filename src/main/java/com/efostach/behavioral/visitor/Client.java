package com.efostach.behavioral.visitor;

public interface Client {

    void buy(Book book);

    void buy(Furniture furniture);
}
