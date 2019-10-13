package com.efostach.behavioral.chain;

public abstract class LoginProcess {
    private int priority;
    private LoginProcess nextLoginProcess;


    public LoginProcess(int priority) {
        this.priority = priority;
    }

    public void setNextLoginStep(LoginProcess nextProcess) {
        this.nextLoginProcess = nextProcess;
    }

    public void notifyLoginManager(int priority) {
        if (priority >= this.priority)
            checkPermission();

        if (nextLoginProcess != null)
            nextLoginProcess.notifyLoginManager(priority);
    }

    public abstract void checkPermission();
}
