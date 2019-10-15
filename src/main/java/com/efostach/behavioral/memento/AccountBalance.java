package com.efostach.behavioral.memento;

import java.util.Date;

public class AccountBalance {
    private int version;
    private Date date;

    public void setVersionAndDate(int version) {
        this.version = version;
        this.date = new Date();
    }

    public BalanceHistory save() {
        return new BalanceHistory(version);
    }

    public void load(BalanceHistory savedBalance) {
        version = savedBalance.getVersion();
        date = savedBalance.getDate();
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "version=" + version +
                ", date=" + date +
                '}';
    }
}
