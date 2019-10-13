package com.efostach.behavioral.command;

public class Resource {
    Command create;
    Command update;
    Command delete;

    public Resource(Command create, Command update, Command delete) {
        this.create = create;
        this.update = update;
        this.delete = delete;
    }

    public void createRecord () {
        create.execute();
    }

    public void updateRecord () {
        update.execute();
    }

    public void deleteRecord () {
        delete.execute();
    }
}
