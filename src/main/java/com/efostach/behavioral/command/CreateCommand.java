package com.efostach.behavioral.command;

public class CreateCommand implements Command {

    private ResourceOrchestrator resourceOrchestrator;

    public CreateCommand(ResourceOrchestrator resourceOrchestrator) {
        this.resourceOrchestrator = resourceOrchestrator;
    }

    @Override
    public void execute() {
        resourceOrchestrator.create();
    }
}
