package com.efostach.behavioral.observer;

public class AppRunner {
    public static void main(String[] args) {

        ChildrenDepositAccount childAccount = new ChildrenDepositAccount();
        Parents dad = new Parents("Parent's Tom");
        Parents mother = new Parents("Parent's Tom");

        System.out.println("Dad and mom are subscribed.");
        System.out.println("Child balance is updated.");
        childAccount.subscribe(dad);
        childAccount.subscribe(mother);
        childAccount.updateBalance(100);

        System.out.println("\nUnsubscribed dad.");
        System.out.println("Child balance is friezed.");
        childAccount.unsubscribe(dad);
        childAccount.freezeBalance();

    }
}
