package com.efostach.behavioral.chain;

public class AppRunner {
    public static void main(String[] args) {
        LoginProcess authentication = new Authentication(Priority.FIRST);
        LoginProcess authorization = new Authorization(Priority.SECOND);

        authentication.setNextLoginStep(authorization);

        authentication.notifyLoginManager(Priority.SECOND);

    }
}
