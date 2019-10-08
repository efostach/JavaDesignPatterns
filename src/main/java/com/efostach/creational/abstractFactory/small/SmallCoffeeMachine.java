package com.efostach.creational.abstractFactory.small;

import com.efostach.creational.abstractFactory.CoffeeMachine;

class SmallCoffeeMachine implements CoffeeMachine {

    public void makeDrink() {
        System.out.println("Making coffee...");
    }
}
