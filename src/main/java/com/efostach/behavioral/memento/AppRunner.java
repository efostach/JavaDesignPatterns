package com.efostach.behavioral.memento;

public class AppRunner {
    public static void main(String[] args) {

        AccountBalance balance = new AccountBalance();
        Account account = new Account();

        System.out.println("v.1");
        balance.setVersionAndDate(1);
        System.out.println(balance);
        account.setHistory(balance.save());

        System.out.println("v.2");
        balance.setVersionAndDate(2);
        System.out.println(balance);

        balance.load(account.getHistory());

        System.out.println("Saved balance");
        System.out.println(balance.toString());

        System.out.println("v.2");
        balance.setVersionAndDate(2);
        System.out.println(balance);
        balance.save();

        System.out.println("Saved balance");
        System.out.println(balance.toString());
    }
}
