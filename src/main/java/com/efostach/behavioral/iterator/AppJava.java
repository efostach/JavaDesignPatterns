package com.efostach.behavioral.iterator;

public class AppJava {
    public static void main(String[] args) {

        String[] friends = {"Mike Brown", "Jose Crosby"};
        SocialNetworkAccounts accountFirst = new SocialNetworkAccounts("LinkedIn", friends);

        Iterator iterator = accountFirst.getIterator();
        System.out.println(accountFirst.getSocialNetworkName());

        while (iterator.hasNext()) {
            System.out.println(iterator.getNext().toString());
        }

    }
}