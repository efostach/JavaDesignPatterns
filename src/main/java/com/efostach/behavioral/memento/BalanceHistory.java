package com.efostach.behavioral.memento;

import java.util.Date;

public class BalanceHistory {
    private final int version;
    private final Date date;

    public BalanceHistory(int version) {
        this.version = version;
        this.date = new Date();
    }

    public int getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}
