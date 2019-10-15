package com.efostach.behavioral.memento;

public class Account {
    private BalanceHistory history;

    public BalanceHistory getHistory() {
        return history;
    }

    public void setHistory(BalanceHistory history) {
        this.history = history;
    }
}
