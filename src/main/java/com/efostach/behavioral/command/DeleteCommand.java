package com.efostach.behavioral.command;

public class DeleteCommand implements Command {

    private ResourceOrchestrator resourceOrchestrator;


    public DeleteCommand(ResourceOrchestrator resourceOrchestrator) {
        this.resourceOrchestrator = resourceOrchestrator;
    }

    @Override
    public void execute() {
        resourceOrchestrator.delete();
    }
}
