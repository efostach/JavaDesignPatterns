package com.efostach.behavioral.command;

public class UpdateCommand implements Command {

    private ResourceOrchestrator resourceOrchestrator;


    public UpdateCommand(ResourceOrchestrator resourceOrchestrator) {
        this.resourceOrchestrator = resourceOrchestrator;
    }

    @Override
    public void execute() {
        resourceOrchestrator.update();
    }
}
