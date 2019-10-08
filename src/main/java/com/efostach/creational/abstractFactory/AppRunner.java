package com.efostach.creational.abstractFactory;

import com.efostach.creational.abstractFactory.small.SmallCoffePointFactory;

class AppRunner {
    public static void main(String[] args) {

        SmallCoffePointFactory coffeePoint = new SmallCoffePointFactory();
        CoffeeMachine coffeeMachine = coffeePoint.getCoffeeMachine();
        Cooler cooler = coffeePoint.getCooler();
        Grinder grinder = coffeePoint.getGrinder();

        coffeeMachine.makeDrink();
        cooler.poorWater();
        grinder.grindCoffeeBeans();
    }
}
